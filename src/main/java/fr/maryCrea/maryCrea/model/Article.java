package fr.maryCrea.maryCrea.model;

import java.util.Date;

public class Article {
    private Long id;
    private String titreArticle;


    private String resume;
    private String article;
    private String image;
    private Date dateArticle;

    public Article(Long id,  String titreArticle,String resume, String article, String image, Date dateArticle) {
        this.id = id;
        this.titreArticle = titreArticle;
        this.resume = resume;


        this.article = article;
        this.image = image;
        this.dateArticle = dateArticle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getTitreArticle() {
        return titreArticle;
    }

    public void setTitreArticle(String titreArticle) {
        this.titreArticle = titreArticle;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDateArticle() {
        return dateArticle;
    }

    public void setDateArticle(Date dateArticle) {
        this.dateArticle = dateArticle;
    }


}
