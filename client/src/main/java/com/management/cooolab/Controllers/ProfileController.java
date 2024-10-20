package com.management.cooolab.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import proxy.proxyProfile.User;
import proxy.proxyProfile.Profile;
import proxy.proxyProfile.ProfileControllerService;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    Profile proxy = new ProfileControllerService().getProfilePort();

    @GetMapping("")
    public String editProfile(Model model) {
        User user=proxy.editProfile();
        model.addAttribute("user", user);
        return "Profile";
    }

    @PostMapping("/update")
    public String updateProfile(@Validated @ModelAttribute("user") User updatedUser, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "Profile/Edit";
        }
        proxy.updateProfile(updatedUser);
        return "redirect:/login";
    }
}