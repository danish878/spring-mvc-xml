package com.danny.jba.controller;

import com.danny.jba.entity.User;
import com.danny.jba.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@AllArgsConstructor

@Controller
@RequestMapping("/register")
public class RegisterController {

    private UserService userService;

    @ModelAttribute("user")
    public User constructUser(){
        return new User();
    }

    @GetMapping
    public String showRegistrer(){
        return "user-register";
    }

    @PostMapping
    public String doRegister(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if(result.hasErrors())
            return showRegistrer();

        userService.save(user);
        return "redirect:/register.html?success=true";
    }

    @GetMapping("/available")
    @ResponseBody
    public String available(@RequestParam String username) {
        boolean available = userService.findByUsername(username) == null;
        return Boolean.toString(available);
    }
}
