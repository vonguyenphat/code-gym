package codegym.vn.formdealthdeclaration.service;

import codegym.vn.formdealthdeclaration.model.HealthDeclaration;

import java.util.List;

public interface IHealthDeclarationService {
    void create(HealthDeclaration healthDeclaration);
    List<HealthDeclaration> findAll();
}
