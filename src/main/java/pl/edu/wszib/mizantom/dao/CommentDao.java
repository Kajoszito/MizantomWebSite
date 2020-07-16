package pl.edu.wszib.mizantom.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.mizantom.domain.Comment;

import java.util.List;

@Repository
public interface CommentDao extends CrudRepository<Comment, Integer> {
     List<Comment> findAll();
}
