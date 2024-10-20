package com.management.cooolab.Controllers;

import com.management.cooolab.Entities.User;
import com.management.cooolab.Services.UserService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.stereotype.Component;

@Component
@WebService(name= "Login")
public class LoginController {
    UserService userService;
    @WebMethod(operationName = "loginUser")
    public User loginUser(String email, String password) {
        return userService.getUsersByEmailAndPassword(email, password);
    }
}
