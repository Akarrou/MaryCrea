package fr.maryCrea.maryCrea.controller;

import fr.maryCrea.maryCrea.model.Article;
import fr.maryCrea.maryCrea.repository.ArticleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String mesArticles(Model out){
        ArticleRepository repository = new ArticleRepository();
        out.addAttribute("articles", repository.findAll());
        return "blog";
    }
    @GetMapping("/monarticle")
    public String monarticle(Model out,@RequestParam(name = "id",defaultValue = "0")Long id){
        ArticleRepository repository = new ArticleRepository();
        out.addAttribute("articles", repository.findById(id));
        return "monarticle";
    }
}
