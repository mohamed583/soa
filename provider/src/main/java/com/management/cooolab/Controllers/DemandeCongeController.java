package com.management.cooolab.Controllers;

import com.management.cooolab.Entities.DemandeConge;
import com.management.cooolab.Entities.Departement;
import com.management.cooolab.Entities.User;
import com.management.cooolab.Services.DemandeCongeService;
import com.management.cooolab.Services.UserService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Component
@WebService(name= "DemandeConge")
public class DemandeCongeController {

    private UserDetailsService userDetailsService;
    private UserService userService;
    private DemandeCongeService demandeCongeService;

    @WebMethod(operationName = "ListMesDemandesConges")
    public List<DemandeConge> ListMesDemandesConges(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();

        User currentUser = userService.getUsersByEmail(currentUserName);
        return demandeCongeService.getDemandeCongeByEmployeeId(currentUser.getId());

    }
    @WebMethod(operationName = "ListDepartementConges")
    public List<DemandeConge> ListDepartementConges(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();
        User currentUser = userService.getUsersByEmail(currentUserName);
        Departement userDepartment = currentUser.getDepartement();
        return demandeCongeService.getAcceptedDemandesCongesByDepartment(userDepartment.getId());
    }
    @WebMethod(operationName = "ListDemandesConges")
    public List<DemandeConge> ListDemandesConges(User user,List<String> authorities){
        if (user != null && authorities.contains("ROLE_ADMIN")) {
            return demandeCongeService.getDemandesCongesByStatus("ONHOLD");
        } else if (user != null && authorities.contains("ROLE_HR")) {
            return demandeCongeService.getDemandesCongesByStatusAndManager("ONHOLD", true);
        } else if (user != null && authorities.contains("ROLE_MANAGER")) {
            return demandeCongeService.getDemandesCongesByStatusAndDepartmentAndManagerAndHr("ONHOLD", user.getDepartement(),false,false);
        } else {
            throw new AccessDeniedException("Unauthorized access");
        }
    }
    @WebMethod(operationName = "AddDemandeConge")
    public DemandeConge AddDemandeConge(){
        DemandeConge demandeConge = new DemandeConge();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String email = userDetails.getUsername();
        User currentUser = userService.getUsersByEmail(email);

        demandeConge.setEmployee(currentUser);
        return demandeConge;
    }
    @WebMethod(operationName = "SaveDemandeConge")
    public void save (DemandeConge demandeConge){
        demandeCongeService.saveDemandeConge(demandeConge);
    }
    @WebMethod(operationName = "EditDemandeConge")
    public DemandeConge EditDemandeConge(int id){
        DemandeConge demandeConge = demandeCongeService.getDemandeCongeById(id);
        if (!demandeConge.getStatus().equals("ONHOLD")) {
            demandeConge.setStatus("ONHOLD");
        }
        demandeCongeService.saveDemandeConge(demandeConge);
        return demandeConge;
    }
    @WebMethod(operationName = "UpdateDemandeConge")
    public void UpdateDemandeConge(DemandeConge demandeConge){
            demandeCongeService.saveDemandeConge(demandeConge);
    }
    @WebMethod(operationName = "DeleteDemandeConge")
    public void DeleteDemandeConge(int id){
        demandeCongeService.deleteDemandeConge(id);
    }
    @WebMethod(operationName = "updateLeaveRequestStatus")
    public void updateLeaveRequestStatus(int id, String status) {
        DemandeConge demandeConge = demandeCongeService.getDemandeCongeById(id);
            demandeConge.setStatus(status);
            demandeCongeService.saveDemandeConge(demandeConge);
    }
}
