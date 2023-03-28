package codegym.vn.furama.repository.customer;


import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer,Integer> {
}
