package codegym.vn.appborrowbook.repository;

import codegym.vn.appborrowbook.model.PersonBookBorrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonBookBorrowerRepository extends JpaRepository<PersonBookBorrower,Long> {

}
