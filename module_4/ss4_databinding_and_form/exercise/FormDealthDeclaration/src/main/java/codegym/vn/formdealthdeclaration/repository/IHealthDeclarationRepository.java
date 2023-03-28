package codegym.vn.formdealthdeclaration.repository;

import codegym.vn.formdealthdeclaration.model.HealthDeclaration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHealthDeclarationRepository extends JpaRepository<HealthDeclaration,Integer> {
}
