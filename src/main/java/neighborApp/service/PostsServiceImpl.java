package neighborApp.service;

import neighborApp.dataModels.Posts;
import neighborApp.repos.PostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostsServiceImpl implements PostsService {

  private PostsRepo postsRepo;

  @Autowired
  public void setInjectedBean(PostsRepo postsRepo) {
    this.postsRepo = postsRepo;
  }
    @Override
    public ArrayList<Posts> findAllPosts() {
        return (ArrayList<Posts>) postsRepo.findAll();
    }

    @Override
    public Posts findAllPostsByID(long id) {
        return null;
    }

    @Override
    public void addPosts() {

    }

    @Override
    public void deleteAllData() {

    }

//
//
//
//    @Override
//    public Posts createPosts(Posts post) {
//        return postsRepo.save(post);
//    }
//
//    @Override
//    public Optional<Posts> getPosts(Long id) {
//        return postsRepo.findById(id);
//    }
//
//    @Override
//    public Posts editPosts(Posts post) {
//        return postsRepo.save(post);
//    }
//
//    @Override
//    public void deletePosts(Posts post) {
//        postsRepo.delete(post);
//    }
//
//    @Override
//    public void deletePosts(Long id) {
//        postsRepo.deleteById(id);
//    }
//
//    @Override
//    public List<Posts> getAllPPosts(int pageNumber, int pageSize) {
//        return postsRepo.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
//    }
//
//    @Override
//    public ArrayList<Posts> getAllPosts() {
//        return (ArrayList<Posts>) postsRepo.findAll();
//    }
//
//    @Override
//    public long countPosts() {
//        return postsRepo.count();
//    }
}
