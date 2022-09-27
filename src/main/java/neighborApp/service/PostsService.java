package neighborApp.service;

import neighborApp.dataModels.Posts;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface PostsService {
//    Posts createPosts(Posts post);
//    Optional<Posts> getPosts(Long id);
//    Posts  editPosts(Posts post);
//    void deletePosts(Posts post);
//    void deletePosts(Long id);
//    List getAllPPosts(int pageNumber, int pageSize);
//    ArrayList<Posts> getAllPosts();
//    long countPosts();

    ArrayList<Posts> findAllPosts();
    Posts findAllPostsByID(long id);
    void addPosts();
    void deleteAllData();

}
