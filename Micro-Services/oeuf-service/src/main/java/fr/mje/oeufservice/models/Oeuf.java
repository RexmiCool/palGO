package fr.mje.oeufservice.models;
import jakarta.persistence.*;

@Entity
@Table(name = "oeuf")
public class Oeuf {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer uid;
    private Integer hatch_time;
    private Integer prix;


    public Oeuf(Integer hatch_time, Integer prix, Integer uid) {
        this.hatch_time = hatch_time;
        this.prix = prix;
        this.uid = uid;
    }

    public Oeuf() { }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHatch_time() {
        return hatch_time;
    }

    public void setHatch_time(Integer hatch_time) {
        this.hatch_time = hatch_time;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }
}
