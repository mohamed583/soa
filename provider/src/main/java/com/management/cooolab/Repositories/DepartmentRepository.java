package com.management.cooolab.Repositories;

import com.management.cooolab.Entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Departement, Integer> {
}
