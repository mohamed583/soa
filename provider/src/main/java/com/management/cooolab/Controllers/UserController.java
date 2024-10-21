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

import java.util.*;

@Component
@WebService(name= "User")
public class UserController {
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
    public List<Integer> listUsers() {
        List<User> users = userService.getAllUsers();
        List<Integer> userIdList = new ArrayList<>();
        for (User user : users) {
            userIdList.add(user.getId());
        }
        return userIdList;
    }
    @WebMethod(operationName = "ListUser")
    public User listUser(int id) {
        return userService.getUserById(id);
    }
    @WebMethod(operationName = "addUser")
    public User addUser() {
        return new User();
    }
    @WebMethod(operationName = "SaveUser")
    public void SaveUser(int id, String email, String password,int department,String privilege) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setDepartement(departmentService.getDepartmentById(department));
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
    @WebMethod(operationName = "EditUser")
    public  User EditUser(int id) {
        return userService.getUserById(id);
    }
    @WebMethod(operationName = "UpdateUser")
    public void UpdateUser(int id, String email, String password,int department,String privilege) {
        User user = userService.getUserById(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setDepartement(departmentService.getDepartmentById(department));
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
    public User showUser(int userId) {
        return userService.getUserById(userId);
    }
    @WebMethod(operationName = "ShowUserDemandeConge")
    public List<DemandeConge> showUserDemandeConge(int userId) {
        return demandeCongeService.getDemandeCongeByEmployeeId(userId);
    }
}
