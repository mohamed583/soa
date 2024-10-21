package com.management.cooolab.Services;

import com.management.cooolab.Entities.Departement;
import com.management.cooolab.Repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Departement> getAllDepartments(){
        return departmentRepository.findAll();
    }
    public Departement getDepartmentById(int id){
        return departmentRepository.findById(id).get();
    }
    public Departement getDepartmentByName(String name){
        return departmentRepository.findByName(name);
    }
    public void saveDepartment(Departement department){
        departmentRepository.save(department);
    }
    public void deleteDepartment(int id){
        departmentRepository.deleteById(id);
    }
}
