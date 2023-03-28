package codegym.vn.managerstudent.service.iml;

import codegym.vn.managerstudent.model.ClassName;
import codegym.vn.managerstudent.repository.IClassNameRepository;
import codegym.vn.managerstudent.service.IClassNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassNameService implements IClassNameService {
    @Autowired
    IClassNameRepository classNameRepository;

    @Override
    public List<ClassName> findAll() {
        return classNameRepository.findAll();
    }
}
