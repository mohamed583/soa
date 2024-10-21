package com.management.cooolab.Controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import proxy.proxyProfile.User;
import proxy.proxyProfile.Profile;
import proxy.proxyProfile.ProfileControllerService;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    Profile proxy = new ProfileControllerService().getProfilePort();

    @GetMapping("")
    public String editProfile(Model model, @AuthenticationPrincipal UserDetails currentUser) {
        User user=proxy.editProfile(currentUser.getUsername());
        model.addAttribute("user", user);
        return "Profile";
    }

    @PostMapping("/update")
    public String updateProfile(@RequestParam("id") int id, @RequestParam("email") String email,
                                @RequestParam("password") String password) {
        proxy.updateProfile(id,email,password);
        return "redirect:/login";
    }
}