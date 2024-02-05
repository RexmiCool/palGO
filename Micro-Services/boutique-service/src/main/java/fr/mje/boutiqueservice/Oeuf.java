package fr.mje.boutiqueservice;

import jakarta.persistence.*;

@Entity
@Table(name = "oeuf")
public class Oeuf {
    private Integer id;
    private Integer prix;
    private Integer hatchTime;

    public Oeuf() {

    }

    public Oeuf(Integer id, Integer prix, Integer hatchTime) {
        this.id = id;
        this.prix = prix;
        this.hatchTime = hatchTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrix() {
        return prix;
    }
    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getHatchTime() {
        return hatchTime;
    }
    public void setHatchTime(Integer hatchTime) {
        this.hatchTime   = hatchTime;
    }
}
