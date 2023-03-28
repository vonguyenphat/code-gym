package codegym.vn.furama.repository.customer;

import codegym.vn.furama.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepo extends JpaRepository<CustomerType,Integer> {
}
