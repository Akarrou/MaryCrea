package fr.maryCrea.maryCrea.controller;

import fr.maryCrea.maryCrea.entity.User;
import fr.maryCrea.maryCrea.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    private UserRepository repository;
    private User user;

    @PostMapping("/index")

    public String home(
            HttpSession session, @RequestParam(name = "email", required = false, defaultValue = "o") String emailValue,
            @RequestParam(name = "password", required = false, defaultValue = "0") String passwordValue) {
        user = repository.findByEmail(emailValue);
        String message = "";
        if (user != null) {
            if (user.getPassword().equals(passwordValue)) {
                session.setAttribute("user", user);
                return "index";
            }else {
                message = "Votre mot de passe est incorect";
            }
        }
        message = "Je vous connais pas";
        return "redirect:/connexion?message=" + message;
    }

}
