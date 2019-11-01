package fr.maryCrea.maryCrea.model;

public class Service {

    private Long id;
    private String titre;
    private String image;
    private String resume;
    private String detail;

    public Service(Long id, String titre, String image, String resume, String detail) {
        this.id = id;
        this.titre = titre;
        this.image = image;
        this.resume = resume;
        this.detail = detail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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


}
