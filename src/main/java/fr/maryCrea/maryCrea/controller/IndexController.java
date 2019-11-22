package fr.maryCrea.maryCrea.controller;

import fr.maryCrea.maryCrea.entity.User;
import fr.maryCrea.maryCrea.repository.ConnexionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired
    private ConnexionRepository repository;
    private User user;
    @PostMapping("/index")

    public String home(
    Model out, @RequestParam(name="email", required = false, defaultValue = "o") String emailValue,
            @RequestParam(name="password", required = false,defaultValue = "0") String passwordValue){
        user = repository.findByEmail(emailValue);
        if(user.getPassword().equals(passwordValue)){
            out.addAttribute("username", user.getName());
            return "index";
        }
        return "connexion";
    }

}
