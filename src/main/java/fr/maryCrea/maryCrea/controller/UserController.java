package fr.maryCrea.maryCrea.controller;

import fr.maryCrea.maryCrea.entity.User;
import fr.maryCrea.maryCrea.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;


@Controller
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/connexion")
    public String conect(Model out, @RequestParam(required = false) String message){
        out.addAttribute("message", message);
        return "connexion";
    }
    @GetMapping("deconection")
    public String deconnection(HttpServletRequest request){
        HttpSession session =request.getSession();
        session.invalidate();
        return "redirect:/";

    }

    @PostMapping("/cruduser")
    public String crudUser(Model out,@RequestParam(required = false) Long id){
        User user = new User();
        if (id != null) {
            Optional<User> optionalUser= repository.findById(id);
            if (optionalUser.isPresent()) {
                user = optionalUser.get();
            }
        }
        out.addAttribute("user", user);
        return "crud-user";
    }

    @PostMapping("/save-user")
    public String postUser (HttpServletRequest request, @ModelAttribute User user) {
        repository.save(user);
        HttpSession session= request.getSession();
        return (!session.isNew()) ?  "/index":"redirect:/connexion";
    }

    @PostMapping("/delete-user")
    public String deleteWUser(@RequestParam Long id) {
        repository.deleteById(id);
        return "redirect:/deconection";
    }
}
