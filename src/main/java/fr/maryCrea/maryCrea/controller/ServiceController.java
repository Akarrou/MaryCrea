package fr.maryCrea.maryCrea.controller;

import fr.maryCrea.maryCrea.entity.Service;
import fr.maryCrea.maryCrea.repository.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ServiceController {

    @Autowired
    private ServicesRepository repository;

    @GetMapping("/service")
    public String mesServices(Model out){
        out.addAttribute("services",repository.findAll());
        return "service";
    }

    @GetMapping("/monservice")
    public String monService(Model out, @RequestParam(name = "id",defaultValue = "0")Long id){
        Service service = new Service();
        if (id != null) {
            Optional<Service> optionalService = repository.findById(id);
            if (optionalService.isPresent()) {
                service = optionalService.get();
            }
            out.addAttribute("service", service);
        }

        return "monservice";
    }

    @GetMapping("/crudservice")
    public String crudServices(Model out,@RequestParam(required = false) Long id){
        Service service = new Service();
        if (id != null) {
            Optional<Service> optionalService = repository.findById(id);
            if (optionalService.isPresent()) {
                service = optionalService.get();
            }

        }
        out.addAttribute("service", service);
        return "crud-service";
    }

    @PostMapping("/save-service")
    public String postService(@ModelAttribute Service service) {
        repository.save(service);
        return "redirect:/service";
    }
    @GetMapping("/delete-service")
    public String deleteService(@RequestParam Long id) {
        repository.deleteById(id);
        return "redirect:/service";
    }
}
