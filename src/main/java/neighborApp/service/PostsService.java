package neighborApp.service;

import neighborApp.models.Post;

import java.util.ArrayList;

public interface PostsService {
//    Posts createPosts(Posts post);
//    Optional<Posts> getPosts(Long id);
//    Posts  editPosts(Posts post);
//    void deletePosts(Posts post);
//    void deletePosts(Long id);
//    List getAllPPosts(int pageNumber, int pageSize);
//    ArrayList<Posts> getAllPosts();
//    long countPosts();

    ArrayList<Post> findAllPosts();
    Post findAllPostsByID(long id);
    void addPosts();
    void deleteAllData();

}
