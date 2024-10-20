package com.management.cooolab.Controllers;

import com.management.cooolab.Entities.DemandeConge;
import com.management.cooolab.Entities.Departement;

import com.management.cooolab.Services.DemandeCongeService;
import com.management.cooolab.Services.DepartmentService;
import com.management.cooolab.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import proxy.proxyUser.User;
import proxy.proxyUser.UserControllerService;
import proxy.proxyUser.User_Type;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DemandeCongeService demandeCongeService;
    User proxy = new UserControllerService().getUserPort();
    @GetMapping("/list")
    public String ListUsers(Model model){
        List<User_Type> users = proxy.listUsers();
        model.addAttribute("users", users);
        return "User/ShowAll";
    }
    @GetMapping("/add")
    public String addUser(Model model) {
        Object[] objects = proxy.addUser().toArray();
        User user = (User) objects[0];
        List<Departement> departments = (List<Departement>) objects[1];
        List<String> privileges = (List<String>) objects[2];
        model.addAttribute("departments", departments);
        model.addAttribute("privileges", privileges);
        model.addAttribute("user", user);
        return "User/Add";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("user") User user, @RequestParam("privilege") String privilege) {
        Object[] request = new Object[] { user, privilege };
       proxy.saveUser(request);
        return "redirect:/user/list";
    }

    @GetMapping("/edit/{id}")
    public String EditUser(@PathVariable("id") int id, Model model) {
        Object[] objects = proxy.editUser(id).toArray();
        User user = (User) objects[0];
        List<Departement> departments = (List<Departement>) objects[1];
        model.addAttribute("departments", departments);
        model.addAttribute("user", user);
        return "User/Edit";
    }

    @PostMapping("/update")
    public String UpdateUser(@ModelAttribute("user") User user, @RequestParam("privilege") String privilege) {
        proxy.updateUser((User_Type) user,privilege);
        return "redirect:/user/list";
    }
    @GetMapping("/delete/{id}")
    public String DeleteUser(@PathVariable("id") int id){
        proxy.deleteUser(id);
        return "redirect:/user/list";
    }
    @GetMapping("/show/{id}")
    public String showUser(@PathVariable("id") int userId, Model model) {
        Object[] objects = proxy.showUser(userId).toArray();
        User user = (User) objects[0];
        List<DemandeConge> demandesConges = (List<DemandeConge>) objects[1];
        if (demandesConges == null) {
            return "redirect:/user/list";
        }
        model.addAttribute("demandesConges",demandesConges);
        model.addAttribute("user", user);
        return "User/Show";
    }
}
