package codegym.vn.car.service;

import codegym.vn.car.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
    void updateProduct(Product product);
}
