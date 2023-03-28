package codegym.vn.managerstudent.service;

import codegym.vn.managerstudent.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {
    void create(Student student);
    void update(Student student);
    void delete(Integer id);
    List<Student> findAll();
    Student findById(Integer id);
    Page<Student> findAllWithPaging(Pageable pageable);
    List<Student> searchByNameAndClass(String name,Integer idClass);

}
