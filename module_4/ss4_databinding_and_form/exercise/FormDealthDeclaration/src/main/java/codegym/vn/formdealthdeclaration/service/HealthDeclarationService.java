package codegym.vn.formdealthdeclaration.service;

import codegym.vn.formdealthdeclaration.model.HealthDeclaration;
import codegym.vn.formdealthdeclaration.repository.IHealthDeclarationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HealthDeclarationService implements IHealthDeclarationService{

    @Autowired
    IHealthDeclarationRepository healthDeclarationRepository;

    @Override
    public void create(HealthDeclaration healthDeclaration) {
        healthDeclarationRepository.save(healthDeclaration);
    }

    @Override
    public List<HealthDeclaration> findAll() {
        return healthDeclarationRepository.findAll();
    }
}
