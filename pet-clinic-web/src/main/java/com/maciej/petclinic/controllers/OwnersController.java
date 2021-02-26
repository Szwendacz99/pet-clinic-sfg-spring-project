package com.maciej.petclinic.controllers;

import com.maciej.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owners")
@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String index(Model model) {
        model.addAttribute("title", "Owners main page");
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
