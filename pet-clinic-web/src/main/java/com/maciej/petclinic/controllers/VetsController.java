package com.maciej.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("vets")
@Controller
public class VetsController {

    @RequestMapping({"","/","/index","/index.html"})
    public String index(Model model) {
        model.addAttribute("title", "Vets main page");
        return "index";
    }
}
