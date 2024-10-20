package com.management.cooolab.Repositories;

import com.management.cooolab.Entities.DemandeConge;
import com.management.cooolab.Entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface DemandeCongeRepository extends JpaRepository<DemandeConge, Integer> {
    @Transactional
    void deleteAllByEmployeeId(int id);
    List<DemandeConge> findByEmployeeId(int departmentId);
    List<DemandeConge> findByStatus(String status);
    List<DemandeConge> findByEmployeeDepartementIdAndStatus(int departmentId, String status);
    List<DemandeConge> findByStatusAndEmployeeManager(String status, boolean Manager);

    List<DemandeConge> findByStatusAndEmployee_DepartementAndEmployee_ManagerAndEmployee_Hr(
            String status,
            Departement departement,
            boolean manager,
            boolean hr
    );}
