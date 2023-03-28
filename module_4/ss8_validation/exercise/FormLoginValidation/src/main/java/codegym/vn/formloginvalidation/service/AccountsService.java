package codegym.vn.formloginvalidation.service;

import codegym.vn.formloginvalidation.model.Accounts;
import codegym.vn.formloginvalidation.repository.IAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService implements IAccountsService{
    @Autowired
    IAccountsRepository accountsRepository;
    @Override
    public void create(Accounts accounts) {
        accountsRepository.save(accounts);
    }
}
