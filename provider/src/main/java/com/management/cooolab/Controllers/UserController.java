package com.management.cooolab.Controllers;

import com.management.cooolab.Entities.DemandeConge;
import com.management.cooolab.Entities.Departement;
import com.management.cooolab.Entities.User;
import com.management.cooolab.Services.DemandeCongeService;
import com.management.cooolab.Services.DepartmentService;
import com.management.cooolab.Services.UserService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@WebService(name= "User")
public class UserController  extends SpringBeanAutowiringSupport {
    @Autowired
    private UserService userService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DemandeCongeService demandeCongeService;
    public UserController() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
    @WebMethod(operationName = "ListUsers")
    public List<User> ListUsers(){
        return userService.getAllUsers();
    }
    @WebMethod(operationName = "addUser")
    public Object[] addUser() {
        User user = new User();
        List<Departement> departments = departmentService.getAllDepartments();
        List<String> privileges = Arrays.asList("admin", "hr", "manager", "employee");
        return new Object[] { user, departments, privileges };
    }
    @WebMethod(operationName = "SaveUser")
    public void save (Object[] request) {
        User user = (User) request[0];
        String privilege = (String) request[1];
        switch (privilege) {
            case "admin":
                user.setHr(true);
                user.setManager(true);
                break;
            case "hr":
                user.setHr(true);
                user.setManager(false);
                break;
            case "manager":
                user.setHr(false);
                user.setManager(true);
                break;
            case "employee":
            default:
                user.setHr(false);
                user.setManager(false);
                break;
        }
        userService.registerUser(user);
    }
    @WebMethod(operationName = "EditUser")
    public  Object[] EditUser(int id) {
        User user = userService.getUserById(id);
        List<Departement> departments = departmentService.getAllDepartments();
        return new Object[] { user, departments };
    }
    @WebMethod(operationName = "UpdateUser")
    public void UpdateUser(User user,String privilege) {
        switch (privilege) {
            case "admin":
                user.setHr(true);
                user.setManager(true);
                break;
            case "hr":
                user.setHr(true);
                user.setManager(false);
                break;
            case "manager":
                user.setHr(false);
                user.setManager(true);
                break;
            case "employee":
                user.setHr(false);
                user.setManager(false);
                break;
        }

        userService.saveUser(user);
    }
    @WebMethod(operationName = "DeleteUser")
    public void DeleteUser(int id){
        userService.deleteUser(id);
    }
    @WebMethod(operationName = "ShowUser")
    public Object[] showUser(int userId) {
        User user = userService.getUserById(userId);
        List<DemandeConge> demandesConges = demandeCongeService.getDemandeCongeByEmployeeId(userId);
        return new Object[] { user, demandesConges };
    }
}
