package fr.maryCrea.maryCrea.controller;

import fr.maryCrea.maryCrea.repository.ConnexionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @PostMapping("/index")
    public String home(
    Model out, @RequestParam(name="email", required = false, defaultValue = "o") String emailValue, @RequestParam(name="password", required = false,defaultValue = "0") String passwordValue){
        ConnexionRepository repository = new ConnexionRepository();

        if (repository.findByEmail(emailValue,passwordValue)){
            out.addAttribute("email", emailValue);
            return "index";
        }
        return "connexion";
    }
}
