package codegym.vn.managerstudent.repository;

import codegym.vn.managerstudent.model.ClassName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClassNameRepository extends JpaRepository<ClassName, Integer> {
}
