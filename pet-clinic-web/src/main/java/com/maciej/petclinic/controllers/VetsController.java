package com.maciej.petclinic.controllers;

import com.maciej.petclinic.services.VetService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("vets")
@Controller
public class VetsController {

    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String index(Model model) {
        model.addAttribute("title", "Vets main page");
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
