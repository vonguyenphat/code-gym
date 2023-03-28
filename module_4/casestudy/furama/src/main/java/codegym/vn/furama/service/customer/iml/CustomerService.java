package codegym.vn.furama.service.customer.iml;

import codegym.vn.furama.model.customer.Customer;
import codegym.vn.furama.repository.customer.ICustomerRepo;
import codegym.vn.furama.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepo customerRepo;

    @Override
    public void create(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public void update(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public void delete(Integer id) {
        customerRepo.deleteById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepo.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> findAllWithPaging(Pageable pageable) {
        return customerRepo.findAll(pageable);
    }
}
