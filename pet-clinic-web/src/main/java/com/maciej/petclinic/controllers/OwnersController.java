package com.maciej.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owners")
@Controller
public class OwnersController {

    @RequestMapping({"","/","/index","/index.html"})
    public String index(Model model) {
        model.addAttribute("title", "Owners main page");
        return "index";
    }
}
