package com.management.cooolab.Controllers;

import com.management.cooolab.Entities.User;
import com.management.cooolab.Services.UserService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Component
@WebService(name= "Profile")
public class ProfileController {

@Autowired
    private UserService userService;
    public ProfileController() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
    @WebMethod(operationName = "editProfile")
    public User editProfile(String email) {
        return userService.getUsersByEmail(email);
    }
    @WebMethod(operationName = "updateProfile")
    public void updateProfile(int id, String email,String password ) {
        User user = userService.getUserById(id);
        user.setEmail(email);
        user.setPassword(password);
        userService.saveUser(user);
    }
}