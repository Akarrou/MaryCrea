package fr.maryCrea.maryCrea.controller;

import fr.maryCrea.maryCrea.entity.DetailService;
import fr.maryCrea.maryCrea.entity.Service;
import fr.maryCrea.maryCrea.repository.DetailServiceRepository;
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

    @Autowired
    private DetailServiceRepository detailServiceRepository;
    private DetailService detailServices;
    @GetMapping("/service")
    public String mesServices(Model out){
        out.addAttribute("services",repository.findAll());
        return "service";
    }

    @GetMapping("/monservice")
    public String monService(Model out, @RequestParam(name = "id",defaultValue = "0")Long id){
        out.addAttribute("detailServices",detailServiceRepository.findDetailServiceByIdServiceIs(id) );
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
            out.addAttribute("detailServices",detailServiceRepository.findDetailServiceByIdServiceIs(id) );
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

    @PostMapping("/cruddetailservice")
    public String cruDetailService(Model out,@RequestParam(required = false) Long idDetailService, @RequestParam(required = false) Long idService){
        DetailService detailService = new DetailService();
        if (idDetailService != null) {
            Optional<DetailService> optionalDetailService = detailServiceRepository.findById(idDetailService);
            if (optionalDetailService.isPresent()) {
                detailService = optionalDetailService.get();
            }
        }
        out.addAttribute("detailservice", detailService);
        out.addAttribute("idServices", idService);
        return "crud-detail-service";
    }

    @PostMapping("/save-detailservice")
    public String postDetailService(@ModelAttribute DetailService detailService) {
        detailServiceRepository.save(detailService);
        return "redirect:/crudservice?id=" + detailService.getIdService();
    }

    @PostMapping("/delete-detailservice")
    public String deleteDetailService(@RequestParam Long id, @RequestParam Long idService) {
        detailServiceRepository.deleteById(id);
        return "redirect:/crudservice?id=" + idService;
    }
}
