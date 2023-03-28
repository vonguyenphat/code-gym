package codegym.vn.exercise.repository;

import codegym.vn.exercise.model.CategoryBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IRepositoryCategory extends JpaRepository<CategoryBlog, Integer> {
    @Modifying
    @Query("SELECT c.blogs from category c where c.idCategory = :id")
    List<CategoryBlog> selectIntoBlog(@Param("id") Integer id);
}
