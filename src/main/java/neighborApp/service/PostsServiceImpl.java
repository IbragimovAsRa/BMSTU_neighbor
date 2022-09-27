package neighborApp.service;

import neighborApp.models.Post;
import neighborApp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostsServiceImpl implements PostsService {

  private PostRepository postRepository;

  @Autowired
  public void setInjectedBean(PostRepository postRepository) {
    this.postRepository = postRepository;
  }
    @Override
    public ArrayList<Post> findAllPosts() {
        return (ArrayList<Post>) postRepository.findAll();
    }

    @Override
    public Post findAllPostsByID(long id) {
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
