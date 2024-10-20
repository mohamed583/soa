package com.management.cooolab.Services;

import com.management.cooolab.Entities.DemandeConge;
import com.management.cooolab.Entities.Departement;
import com.management.cooolab.Repositories.DemandeCongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeCongeService {
    @Autowired
    private DemandeCongeRepository demandeCongeRepository;

    public List<DemandeConge> getAllDemandeConge(){
        return demandeCongeRepository.findAll();
    }
    public DemandeConge getDemandeCongeById(int id){
        return demandeCongeRepository.findById(id).get();
    }
    public List<DemandeConge> getDemandeCongeByEmployeeId(int userId) {
        return demandeCongeRepository.findByEmployeeId(userId);
    }
    public List<DemandeConge> getDemandesCongesByStatus(String status) {
        return demandeCongeRepository.findByStatus(status);
    }
    public void saveDemandeConge(DemandeConge demandeConge){
        demandeCongeRepository.save(demandeConge);
    }
    public void deleteDemandeConge(int id){
        demandeCongeRepository.deleteById(id);
    }
    public List<DemandeConge> getAcceptedDemandesCongesByDepartment(int departmentId) {
        return demandeCongeRepository.findByEmployeeDepartementIdAndStatus(departmentId, "ACCEPTED");
    }
    public List<DemandeConge> getDemandesCongesByStatusAndManager(String status, boolean isManager) {
        return demandeCongeRepository.findByStatusAndEmployeeManager(status, isManager);
    }

    public List<DemandeConge> getDemandesCongesByStatusAndDepartmentAndManagerAndHr(String status, Departement department, boolean isManager, boolean isHr) {
        return demandeCongeRepository.findByStatusAndEmployee_DepartementAndEmployee_ManagerAndEmployee_Hr(status, department,isManager,isHr);
    }
}
