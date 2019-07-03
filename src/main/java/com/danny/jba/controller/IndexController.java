package com.danny.jba.controller;

import com.danny.jba.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor

@Controller
public class IndexController {

    private ItemService itemService;

    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {
        model.addAttribute("items", itemService.getItems());
        return "index"; // path comes from 'general.xml' definition 'index'
    }
}
