package codegym.vn.repository;

import codegym.vn.bean.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class CustomerRepository implements ICustomerRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void createOrUpdate(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public void create(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public void update(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public Customer findById(int id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public List<Customer> findAll() {
        return entityManager.createQuery("select c from Customer c").getResultList();

    }

    @Override
    public List<Customer> findByName(String name) {
        return entityManager.createQuery("select c from Customer c where c.name like :name").getResultList();
    }

    @Override
    public void deleteById(int id) {
        Customer c = findById(id);
        entityManager.remove(c);
    }
}
