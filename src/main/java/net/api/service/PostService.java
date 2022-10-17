package net.api.service;

import net.api.model.Post;

import java.util.List;

public interface PostService {

    List<Post> getAll();
    Post save(Post post);
    Post getById(Long id);

    void delete(Long id);
}
