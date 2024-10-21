package com.management.cooolab.Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import proxy.proxyDepartment.Departement;
import proxy.proxyDepartment.DepartmentControllerService;
import proxy.proxyDepartment.User;
import proxy.proxyDepartment.Department;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    Department proxy = new DepartmentControllerService().getDepartmentPort();
    @GetMapping("/list")
    public String ListDepartments(Model model){
        List<Departement> departments = proxy.listDepartments();
        model.addAttribute("departments", departments);
        return "Department/ShowAll";
    }
    @GetMapping("/add")
    public String AddDepartment(Model model){
        Departement departement = proxy.addDepartment();
        model.addAttribute("departement", departement);
        return "Department/Add";
    }
    @PostMapping("/save")
    public  String save (@ModelAttribute("departement") Departement departement){
        proxy.updateDepartment(departement);
        return "redirect:/department/list";
    }
    @GetMapping("/edit/{id}")
    public String EditDepartment(@PathVariable("id") int id, Model model){
       Departement department=proxy.editDepartment(id);
        model.addAttribute("departement", department);
        return "Department/Edit";
    }
    @PostMapping("/update")
    public String UpdateDepartment(@Validated Departement department, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "redirect:/department/edit/"+ department.getId();
        }
        proxy.updateDepartment(department);
        return "redirect:/department/list";
    }
    @GetMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable("id") int id, @RequestParam(value = "deleteUsers", defaultValue = "false") boolean deleteUsers) {
        proxy.deleteDepartment(id,deleteUsers);
        return "redirect:/department/list";
    }
    @GetMapping("/show/{id}")
    public String showDepartment(@PathVariable("id") int id, Model model) {

        List<User> users = proxy.showDepartmentUsers(id);
        Departement department = proxy.showDepartment(id);
        if (department == null) {
            return "redirect:/department/list";
        }
        model.addAttribute("users",users);
        model.addAttribute("department", department);
        return "Department/Show";
    }


}
