package codegym.vn.managerstudent.repository;

import codegym.vn.managerstudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByNameStudentContainingAndClassName_ClassID(String name,Integer id);
}
