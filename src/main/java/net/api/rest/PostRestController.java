package net.api.rest;


import net.api.model.Post;
import net.api.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/posts/")
public class PostRestController {

private final PostService postService;

    public PostRestController(PostService postService) {
        this.postService = postService;
    }

    /**
     *
     **/
    @CrossOrigin
    @GetMapping(path = "")
    public List<Post> getAllPosts() {
        return postService.getAll();
    }
    @GetMapping(path = "{post_id}")
    public Post getPostById(@PathVariable(name = "post_id") Long post_id) {
        return postService.getById(post_id);
    }
    @PostMapping(path = "")
    public ResponseEntity savePost(@RequestBody Post post) {
        postService.save(post);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @DeleteMapping(path = "{post_id}")
    public ResponseEntity deletePostById(@PathVariable(name = "post_id") Long post_id) {
        postService.delete(post_id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
