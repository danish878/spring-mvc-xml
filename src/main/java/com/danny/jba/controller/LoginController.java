package com.danny.jba.controller;

import com.danny.jba.entity.User;
import com.danny.jba.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}