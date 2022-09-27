package neighborApp.controlers;

import neighborApp.dataModels.Posts;
import neighborApp.service.PostsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestCon {
    PostsServiceImpl postsServiceImpl;
    @Autowired
    public void setInjectedBean(PostsServiceImpl postsServiceImpl) {
        this.postsServiceImpl = postsServiceImpl;
    }
    @GetMapping("/findAllPosts")
    public List<Posts> getAllPosts() {
        return postsServiceImpl.findAllPosts();
    }
}
