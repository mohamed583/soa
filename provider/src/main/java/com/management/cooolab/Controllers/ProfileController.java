package com.management.cooolab.Controllers;

import com.management.cooolab.Entities.User;
import com.management.cooolab.Services.UserService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.stereotype.Component;

@Component
@WebService(name= "Profile")
public class ProfileController {


    private UserService userService;

    @WebMethod(operationName = "editProfile")
    public User editProfile() {
        return userService.getCurrentUser();
    }
    @WebMethod(operationName = "updateProfile")
    public void updateProfile(User updatedUser) {
        userService.saveUser(updatedUser);
    }
}