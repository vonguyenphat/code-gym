package codegym.vn.furama.service.customer;


import org.springframework.stereotype.Service;

@Service
public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
