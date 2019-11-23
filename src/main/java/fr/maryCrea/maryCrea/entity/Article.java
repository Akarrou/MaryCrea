package fr.maryCrea.maryCrea.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titreArticle;
    private String resume;
    private String detail;
    private String image;
    private LocalDateTime dateArticle = LocalDateTime.now();;


    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitreArticle() {
        return titreArticle;
    }

    public void setTitreArticle(String titreArticle) {
        this.titreArticle = titreArticle;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getDateArticle() {
        return dateArticle;
    }

    public void setDateArticle(LocalDateTime dateArticle) {
        this.dateArticle = dateArticle;
    }
}
