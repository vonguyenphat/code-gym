package codegym.vn.service;

import codegym.vn.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    private static ArrayList<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer(11,true,"A"));
        customers.add(new Customer(14,false,"B"));
        customers.add(new Customer(4,false,"C"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }
    @Override
    public void save(Customer customer) {
    }
}
