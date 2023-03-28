package codegym.vn.exercise.repository;

import codegym.vn.exercise.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositoryBlog extends JpaRepository<Blog, Integer> {
    @Query("select b.id, b.name, b.content, b.categoryBlog.idCategory from blog b  where  b.categoryBlog.idCategory= :idCategoryParam")
    List<Blog> listQueryCategory(@Param("idCategoryParam") Integer idCategoryParam);
    List<Blog> findAllByCategoryBlog_IdCategory(Integer id);
    List<Blog> findByNameContaining(String name);
}
