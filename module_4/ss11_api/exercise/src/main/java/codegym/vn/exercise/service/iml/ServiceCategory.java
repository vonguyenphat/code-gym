package codegym.vn.exercise.service.iml;

import codegym.vn.exercise.model.CategoryBlog;
import codegym.vn.exercise.repository.IRepositoryCategory;
import codegym.vn.exercise.service.IServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategory implements IServiceCategory {
    @Autowired
    private IRepositoryCategory repositoryCategory;
    @Override
    public List<CategoryBlog> findAll() {
        return repositoryCategory.findAll();
    }

    @Override
    public CategoryBlog findById(Integer id) {
        return repositoryCategory.findById(id).orElse(null);
    }

    @Override
    public void create(CategoryBlog categoryBlog) {
        repositoryCategory.save(categoryBlog);
    }

    @Override
    public void update(CategoryBlog categoryBlog) {
        repositoryCategory.save(categoryBlog);
    }

    @Override
    public void deleteById(Integer id) {
        repositoryCategory.deleteById(id);
    }

    @Override
    public List<CategoryBlog> findIDCategory(Integer id) {
        return repositoryCategory.selectIntoBlog(id);
    }
}
