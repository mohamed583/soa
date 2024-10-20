package com.management.cooolab.Controllers;

import com.management.cooolab.Entities.DemandeConge;
import com.management.cooolab.Entities.Departement;
import com.management.cooolab.Entities.User;
import com.management.cooolab.Services.DemandeCongeService;
import com.management.cooolab.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/leaveRequest")
public class DemandeCongeController {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private UserService userService;
    @Autowired
    private DemandeCongeService demandeCongeService;
    @GetMapping("/mine/list")
    public String ListMesDemandesConges(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();

        User currentUser = userService.getUsersByEmail(currentUserName);
        List<DemandeConge> demandesConges = demandeCongeService.getDemandeCongeByEmployeeId(currentUser.getId());
        model.addAttribute("demandesConges", demandesConges);
        return "DemandeConge/MyLeaves";
    }
    @GetMapping("/department/list")
    public String ListDepartementConges(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();
        User currentUser = userService.getUsersByEmail(currentUserName);
        Departement userDepartment = currentUser.getDepartement();
        List<DemandeConge> demandesConges = demandeCongeService.getAcceptedDemandesCongesByDepartment(userDepartment.getId());
        model.addAttribute("demandesConges", demandesConges);
        return "DemandeConge/DepartmentLeaves";
    }
    @GetMapping("/list")
    public String ListDemandesConges(Model model, @AuthenticationPrincipal UserDetails currentUser){
        List<DemandeConge> demandesConges;
        if (currentUser != null && currentUser.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"))) {
            demandesConges = demandeCongeService.getDemandesCongesByStatus("ONHOLD");
        } else if (currentUser != null && currentUser.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_HR"))) {
            demandesConges = demandeCongeService.getDemandesCongesByStatusAndManager("ONHOLD", true);
        } else if (currentUser != null && currentUser.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_MANAGER"))) {
            String userEmail = currentUser.getUsername();
            User user = userService.getUsersByEmail(userEmail);
            demandesConges = demandeCongeService.getDemandesCongesByStatusAndDepartmentAndManagerAndHr("ONHOLD", user.getDepartement(),false,false);
        } else {
            throw new AccessDeniedException("Unauthorized access");
        }

        model.addAttribute("demandesConges", demandesConges);
        return "DemandeConge/Requests";
    }
    @GetMapping("/add")
    public String AddDemandeConge(Model model){
        DemandeConge demandeConge = new DemandeConge();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String email = userDetails.getUsername();
        User currentUser = userService.getUsersByEmail(email);

        demandeConge.setEmployee(currentUser);
        model.addAttribute("demandeConge", demandeConge);
        return "DemandeConge/Add";
    }
    @PostMapping("/save")
    public  String save (@ModelAttribute("demandeConge") DemandeConge demandeConge){
        demandeCongeService.saveDemandeConge(demandeConge);
        return "redirect:/leaveRequest/mine/list";
    }
    @GetMapping("/edit/{id}")
    public String EditDemandeConge(@PathVariable("id") int id, Model model){
        DemandeConge demandeConge = demandeCongeService.getDemandeCongeById(id);
        if (!demandeConge.getStatus().equals("ONHOLD")) {
            demandeConge.setStatus("ONHOLD");
        }
        demandeCongeService.saveDemandeConge(demandeConge);
        model.addAttribute("demandeConge", demandeConge);
        return "DemandeConge/Edit";
    }
    @PostMapping("/update")
    public String UpdateDemandeConge(@Validated DemandeConge demandeConge, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "redirect:/leaveRequest/edit/"+ demandeConge.getId();
        }
        demandeCongeService.saveDemandeConge(demandeConge);
        return "redirect:/leaveRequest/mine/list";
    }
    @GetMapping("/delete/{id}")
    public String DeleteDemandeConge(@PathVariable("id") int id){
        demandeCongeService.deleteDemandeConge(id);
        return "redirect:/leaveRequest/mine/list";
    }
    @PostMapping("/updateStatus/{id}")
    public String updateLeaveRequestStatus(@PathVariable("id") int id, @RequestParam("status") String status, RedirectAttributes redirectAttributes) {
        DemandeConge demandeConge = demandeCongeService.getDemandeCongeById(id);
            demandeConge.setStatus(status);
            demandeCongeService.saveDemandeConge(demandeConge);
            redirectAttributes.addFlashAttribute("successMessage", "Leave request " + status.toLowerCase() + " successfully.");
        return "redirect:/leaveRequest/list";
    }
}
