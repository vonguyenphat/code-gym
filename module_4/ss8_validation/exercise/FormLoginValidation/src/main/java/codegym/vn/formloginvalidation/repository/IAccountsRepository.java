package codegym.vn.formloginvalidation.repository;

import codegym.vn.formloginvalidation.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountsRepository extends JpaRepository<Accounts,Integer> {
}
