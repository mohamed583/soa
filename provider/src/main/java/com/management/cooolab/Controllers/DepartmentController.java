package com.management.cooolab.Controllers;

import com.management.cooolab.Entities.Departement;
import com.management.cooolab.Entities.User;
import com.management.cooolab.Services.DepartmentService;
import com.management.cooolab.Services.UserService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.util.List;

@Component
@WebService(name= "Department")
public class DepartmentController {
@Autowired
    private DepartmentService departmentService;
@Autowired
    private UserService userService;
    public DepartmentController() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
    @WebMethod(operationName = "ListDepartments")
    public List<Departement> ListDepartments(){
        return departmentService.getAllDepartments();
    }
    @WebMethod(operationName = "AddDepartment")
    public Departement AddDepartment(){
        return new Departement();
    }
    @WebMethod(operationName = "SaveDepartment")
    public void save (Departement departement){
        departmentService.saveDepartment(departement);
    }
    @WebMethod(operationName = "EditDepartment")
    public Departement EditDepartment(int id){
        Departement department = departmentService.getDepartmentById(id);
        departmentService.saveDepartment(department);
        return department;
    }
    @WebMethod(operationName = "UpdateDepartment")
    public void UpdateDepartment(Departement department){
            departmentService.saveDepartment(department);
    }
    @WebMethod(operationName = "DeleteDepartment")
    public void deleteDepartment(int id,  boolean deleteUsers) {
        Departement department = departmentService.getDepartmentById(id);

        if (department != null) {
            List<User> users = userService.getUsersByDepartment(id);

            if (deleteUsers) {
                for (User user : users) {
                    userService.deleteUser(user.getId());
                }
            } else {
                for (User user : users) {
                    user.setDepartement(null);
                    userService.saveUser(user);
                }
            }

            departmentService.deleteDepartment(id);
        }

    }
    @WebMethod(operationName = "showDepartment")
    public Object[] showDepartment(int id) {
        Departement department = departmentService.getDepartmentById(id);
        List<User> users = userService.getUsersByDepartment(id);
        return new Object[] {users, department} ;
    }

}
