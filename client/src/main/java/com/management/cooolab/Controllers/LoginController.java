package com.management.cooolab.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import proxy.proxyLogin.Login;
import proxy.proxyLogin.LoginControllerService;
import proxy.proxyLogin.User;

@Controller
public class LoginController {
    Login proxy = new LoginControllerService().getLoginPort();
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        User user=proxy.loginUser(email, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "redirect:/leaveRequest/mine/list";
        } else {
            model.addAttribute("error", "Email ou mot de passe incorrect.");
            return "login";
        }
    }
}
