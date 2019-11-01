package fr.maryCrea.maryCrea.controller;

import fr.maryCrea.maryCrea.repository.ServicesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ServiceController {
    @GetMapping("/service")
    public String mesServices(Model out){
        ServicesRepository repository = new ServicesRepository();
        out.addAttribute("services",repository.findAll());
        return "service";
    }
    @GetMapping("/monservice")
    public String monService(Model out, @RequestParam(name = "id",defaultValue = "0")Long id){
        ServicesRepository repository = new ServicesRepository();
        out.addAttribute("service",repository.findById(id));

        return "monservice";
    }

}
