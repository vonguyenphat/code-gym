package codegym.vn.wedblog.service;

import codegym.vn.wedblog.bean.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    void save(Blog blog);
    void update(int id,Blog blog);
    Blog findByIdMy(int id);
    void deleteById(int id);
    Page<Blog> findAll(Pageable pageable);
}
