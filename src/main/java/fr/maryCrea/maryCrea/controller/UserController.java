package fr.maryCrea.maryCrea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/connexion")
    public String conect(Model out, @RequestParam(required = false) String message){
        out.addAttribute("message", message);
        return "connexion";
    }

}
