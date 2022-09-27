package neighborApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import neighborApp.models.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
