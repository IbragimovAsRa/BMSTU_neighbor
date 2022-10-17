package net.proselyte.jwtappdemo.service.impl;

import net.proselyte.jwtappdemo.model.Post;
import net.proselyte.jwtappdemo.model.User;
import net.proselyte.jwtappdemo.repository.PostRepository;
import net.proselyte.jwtappdemo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}
