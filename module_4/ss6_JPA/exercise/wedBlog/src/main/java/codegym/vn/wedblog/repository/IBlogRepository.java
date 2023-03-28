package codegym.vn.wedblog.repository;

import codegym.vn.wedblog.bean.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {

}
