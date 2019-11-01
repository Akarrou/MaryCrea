package fr.maryCrea.maryCrea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConnexionController {
    @GetMapping("/connexion")
    public String conect(){
        return "connexion";
    }


}
