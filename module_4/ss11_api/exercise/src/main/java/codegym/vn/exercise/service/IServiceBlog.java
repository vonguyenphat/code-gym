package codegym.vn.exercise.service;

import codegym.vn.exercise.model.Blog;

import java.util.List;

public interface IServiceBlog {
    List<Blog> findAll();

    Blog findById(Integer id);

    void create(Blog blog);

    void update(Blog blog);

    void deleteById(Integer id);

    List<Blog> listQueryCategory(Integer id);
    List<Blog> search(String name);
}
