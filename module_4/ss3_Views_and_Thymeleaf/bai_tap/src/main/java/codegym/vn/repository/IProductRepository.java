package codegym.vn.repository;

import codegym.vn.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id,Product product);

    boolean remove(int id);

    List<Product> search(String name);
}
