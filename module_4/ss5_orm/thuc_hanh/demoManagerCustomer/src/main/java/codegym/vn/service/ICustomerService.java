package codegym.vn.service;

import codegym.vn.bean.Customer;

import java.util.List;



public interface ICustomerService {
    void createOrUpdate(Customer customer);
    void create(Customer customer);
    void update(Customer customer);
    Customer findById(int id);
    List<Customer> findAll();
    List<Customer> findByName(String name);
    void deleteById(int id);
}
