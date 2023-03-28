package codegym.vn.furama.service.customer.iml;

import codegym.vn.furama.model.customer.CustomerType;
import codegym.vn.furama.repository.customer.ICustomerTypeRepo;
import codegym.vn.furama.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    ICustomerTypeRepo customerTypeRepo;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepo.findAll();
    }
}
