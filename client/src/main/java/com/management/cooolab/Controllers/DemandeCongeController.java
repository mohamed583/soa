package com.management.cooolab.Controllers;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import proxy.proxyDemandeConge.DemandeConge;
import proxy.proxyDemandeConge.DemandeCongeControllerService;
import proxy.proxyDemandeConge.DemandeConge_Type;
import proxy.proxyDemandeConge.User;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/leaveRequest")
public class DemandeCongeController {

    DemandeConge proxy = new DemandeCongeControllerService().getDemandeCongePort();

    @GetMapping("/list")
    public String ListDemandesConges(Model model, @AuthenticationPrincipal UserDetails currentUser){
        List<String> authorities = currentUser.getAuthorities().stream()
                .map(a -> a.getAuthority())
                .collect(Collectors.toList());
        User user= new User();
        user.setEmail(currentUser.getUsername());
        List<DemandeConge_Type> demandesConges= proxy.listDemandesConges(user,authorities);

        model.addAttribute("demandesConges", demandesConges);
        return "DemandeConge/Requests";
    }
    @GetMapping("/mine/list")
    public String ListMesDemandesConges(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();

       List<DemandeConge_Type> demandesConges = proxy.listMesDemandesConges(currentUserName);
        model.addAttribute("demandesConges", demandesConges);
        return "DemandeConge/MyLeaves";
    }
    @GetMapping("/department/list")
    public String ListDepartementConges(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();
        List<DemandeConge_Type> demandesConges = proxy.listDepartementConges(currentUserName);
        model.addAttribute("demandesConges", demandesConges);
        return "DemandeConge/DepartmentLeaves";
    }
@GetMapping("/add")
    public String AddDemandeConge(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String email = userDetails.getUsername();
        DemandeConge_Type demandeConge = proxy.addDemandeConge(email);
        model.addAttribute("demandeConge", demandeConge);
        return "DemandeConge/Add";
    }
     @PostMapping("/save")
    public String save (@ModelAttribute("demandeConge") DemandeConge_Type demandeConge){
        proxy.updateDemandeConge(demandeConge);
        return "redirect:/leaveRequest/mine/list";
    }
    @GetMapping("/edit/{id}")
    public String EditDemandeConge(@PathVariable("id") int id, Model model){
        DemandeConge_Type demandeConge = proxy.editDemandeConge(id);
        model.addAttribute("demandeConge", demandeConge);
        return "DemandeConge/Edit";
    }
    @PostMapping("/update")
    public String UpdateDemandeConge(@Validated DemandeConge_Type demandeConge, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "redirect:/leaveRequest/edit/"+ demandeConge.getId();
        }
        proxy.updateDemandeConge(demandeConge);
        return "redirect:/leaveRequest/mine/list";
    }
    @GetMapping("/delete/{id}")
    public String DeleteDemandeConge(@PathVariable("id") int id){
        proxy.deleteDemandeConge(id);
        return "redirect:/leaveRequest/mine/list";
    }
    @PostMapping("/updateStatus/{id}")
    public String updateLeaveRequestStatus(@PathVariable("id") int id, @RequestParam("status") String status, RedirectAttributes redirectAttributes) {
        proxy.updateLeaveRequestStatus(id, status);
            redirectAttributes.addFlashAttribute("successMessage", "Leave request " + status.toLowerCase() + " successfully.");
        return "redirect:/leaveRequest/list";
    }
}
