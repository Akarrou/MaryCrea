package fr.maryCrea.maryCrea.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping  ("/")
    public String home() {
        return "index";
    }
}