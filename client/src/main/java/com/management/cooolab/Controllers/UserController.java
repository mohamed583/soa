package com.management.cooolab.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import proxy.proxyDepartment.Departement;
import proxy.proxyDepartment.Department;
import proxy.proxyDepartment.DepartmentControllerService;
import proxy.proxyUser.DemandeConge;
import proxy.proxyUser.User;
import proxy.proxyUser.UserControllerService;
import proxy.proxyUser.User_Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    User proxy = new UserControllerService().getUserPort();
    Department proxyDep = new DepartmentControllerService().getDepartmentPort();
    @GetMapping("/list")
    public String ListUsers(Model model){
        List<Integer> usersId = proxy.listUsers();
        List<User_Type> users = new ArrayList<>();
        for (int userId : usersId) {
            users.add(proxy.listUser(userId));
            System.out.println(proxy.listUser(userId));
        }
        model.addAttribute("users", users);
        return "User/ShowAll";
    }
    @GetMapping("/add")
    public String addUser(Model model) {
        User_Type user = proxy.addUser();
        List<Departement> departments = proxyDep.listDepartments();
        List<String> privileges = Arrays.asList("admin", "hr", "manager", "employee");
        model.addAttribute("departments", departments);
        model.addAttribute("privileges", privileges);
        model.addAttribute("user", user);
        return "User/Add";
    }
    @PostMapping("/save")
    public String save(@RequestParam("id") int id, @RequestParam("email") String email, @RequestParam("password") String password,@RequestParam("departement") int department, @RequestParam("privilege") String privilege) {
        proxy.saveUser(id,email,password,department,privilege);
        return "redirect:/user/list";
    }

    @GetMapping("/edit/{id}")
    public String EditUser(@PathVariable("id") int id, Model model) {
        User_Type user = proxy.editUser(id);
        List<Departement> departments = proxyDep.listDepartments();
        model.addAttribute("departments", departments);
        model.addAttribute("user", user);
        return "User/Edit";
    }

    @PostMapping("/update")
    public String UpdateUser(@RequestParam("id") int id, @RequestParam("email") String email, @RequestParam("password") String password,@RequestParam("departement") int department, @RequestParam("privilege") String privilege) {
        proxy.updateUser(id,email,password,department,privilege);
        return "redirect:/user/list";
    }

    @GetMapping("/delete/{id}")
    public String DeleteUser(@PathVariable("id") int id){
        proxy.deleteUser(id);
        return "redirect:/user/list";
    }
    @GetMapping("/show/{id}")
    public String showUser(@PathVariable("id") int userId, Model model) {
        User_Type user = proxy.showUser(userId);
        List<DemandeConge> demandesConges = proxy.showUserDemandeConge(userId);
        if (demandesConges == null) {
            return "redirect:/user/list";
        }
        model.addAttribute("demandesConges",demandesConges);
        model.addAttribute("user", user);
        return "User/Show";
    }
}
