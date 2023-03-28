package codegym.vn.appborrowbook.service.iml;

import codegym.vn.appborrowbook.model.PersonBookBorrower;
import codegym.vn.appborrowbook.repository.IPersonBookBorrowerRepository;
import codegym.vn.appborrowbook.service.IPersonBookBorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class PersonBookBorrowerService implements IPersonBookBorrowerService {
    @Autowired
    private IPersonBookBorrowerRepository personBookBorrowerRepository;


    @Override
    public void create(PersonBookBorrower personBookBorrower) {
        personBookBorrower.setBookLoanCard((long) ((Math.random() * (99999 - 10000 + 1)) + 10000));
        personBookBorrowerRepository.save(personBookBorrower);

    }
    @Override
    public void update(PersonBookBorrower personBookBorrower) {
        personBookBorrowerRepository.save(personBookBorrower);
    }

    @Override
    public void delete(Long id) {
        personBookBorrowerRepository.deleteById(id);
    }

    @Override
    public List<PersonBookBorrower> findAll() {
        return personBookBorrowerRepository.findAll();
    }

    @Override
    public void deleteByIdLongCar(Long idBookLoanCard, Long idPerson) {
//        personBookBorrowerRepository.deleteByIdLongCar(idBookLoanCard, idPerson);
    }

    @Override
    public PersonBookBorrower findById(Long id) {
        return personBookBorrowerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<PersonBookBorrower> findAllWithPaging(Pageable pageable) {
        return null;
    }
}
