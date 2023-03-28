package codegym.vn.repository;

import codegym.vn.bean.Customer;


import java.util.List;

public interface ICustomerRepository {
    void createOrUpdate(Customer customer);
    void create(Customer customer);
    void update(Customer customer);
    Customer findById(int id);
    List<Customer> findAll();
    List<Customer> findByName(String name);
    void deleteById(int id);
}
