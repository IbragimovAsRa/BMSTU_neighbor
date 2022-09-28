package neighborApp.controlers;

import neighborApp.models.Post;
import neighborApp.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestCon {
    PostServiceImpl postServiceImpl;
    @Autowired
    public void setInjectedBean(PostServiceImpl postServiceImpl) {
        this.postServiceImpl = postServiceImpl;
    }
    @GetMapping("/findAllPosts")
    public List<Post> getAllPosts() {
        return postServiceImpl.findAllPosts();
    }
    
}
