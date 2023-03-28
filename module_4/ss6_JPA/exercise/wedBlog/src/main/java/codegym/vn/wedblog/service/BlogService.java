package codegym.vn.wedblog.service;

import codegym.vn.wedblog.bean.Blog;
import codegym.vn.wedblog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("BlogService")
public class BlogService implements IBlogService {

    @Autowired
    IBlogRepository blogRepository;

    @Override
    public List<Blog> getAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(int id,Blog blog) {
        Blog bl = findByIdMy(id);
        blogRepository.save(bl);
    }

    @Override
    public Blog findByIdMy(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }
}
