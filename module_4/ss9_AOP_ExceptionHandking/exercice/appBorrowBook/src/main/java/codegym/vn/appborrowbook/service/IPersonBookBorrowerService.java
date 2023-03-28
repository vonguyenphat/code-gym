package codegym.vn.appborrowbook.service;

import codegym.vn.appborrowbook.model.PersonBookBorrower;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPersonBookBorrowerService {
    void create(PersonBookBorrower personBookBorrower);
    void update(PersonBookBorrower personBookBorrower);
    void delete(Long id);
    List<PersonBookBorrower> findAll();
    void deleteByIdLongCar(Long idBookLoanCard,Long idPerson);
    PersonBookBorrower findById(Long id);
    Page<PersonBookBorrower> findAllWithPaging(Pageable pageable);
}
