package neighborApp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import neighborApp.dataModels.Posts;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface PostsRepo extends JpaRepository<Posts, Long> {
}
