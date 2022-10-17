package net.proselyte.jwtappdemo.service;

import net.proselyte.jwtappdemo.model.Post;
import net.proselyte.jwtappdemo.model.User;

import java.util.ArrayList;
import java.util.List;

public interface PostService {

    List<Post> getAll();
    Post save(Post post);
    Post getById(Long id);

    void delete(Long id);
}
