package fr.mje.boutiqueservice.models;
import jakarta.persistence.*;

@Entity
@Table(name = "boutique")
public class Boutique {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer oeuf_1_hatch_time;
    private Integer oeuf_1_prix;
    private Integer oeuf_2_hatch_time;
    private Integer oeuf_2_prix;
    private Integer incubateur_1_prix;
    private Integer incubateur_2_prix;

    public Boutique(Integer oeuf_1_hatch_time, Integer oeuf_1_prix, Integer oeuf_2_hatch_time, Integer oeuf_2_prix, Integer incubateur_1_prix, Integer incubateur_2_prix) {
        this.oeuf_1_hatch_time = oeuf_1_hatch_time;
        this.oeuf_1_prix = oeuf_1_prix;

        this.oeuf_2_hatch_time = oeuf_2_hatch_time;
        this.oeuf_2_prix = oeuf_2_prix;

        this.incubateur_1_prix = incubateur_1_prix;

        this.incubateur_2_prix = incubateur_2_prix;
    }


    public Boutique() {
        this.randomBoutique();
    }

    public void randomBoutique(){
        this.oeuf_1_hatch_time = (int)Math.floor(Math.random() * (100 - 10 + 1) + 10);
        this.oeuf_1_prix = (int)Math.floor(Math.random() * (100 - 10 + 1) + 10);

        this.oeuf_2_hatch_time = (int)Math.floor(Math.random() * (100 - 10 + 1) + 10);
        this.oeuf_2_prix = (int)Math.floor(Math.random() * (100 - 10 + 1) + 10);

        this.incubateur_1_prix = (int)Math.floor(Math.random() * (1000 - 100 + 1) + 100);

        this.incubateur_2_prix = (int)Math.floor(Math.random() * (1000 - 100 + 1) + 100);
    }


    public Integer getOeuf_1_hatch_time() {
        return oeuf_1_hatch_time;
    }

    public void setOeuf_1_hatch_time(Integer oeuf_1_hatch_time) {
        this.oeuf_1_hatch_time = oeuf_1_hatch_time;
    }

    public Integer getOeuf_1_prix() {
        return oeuf_1_prix;
    }

    public void setOeuf_1_prix(Integer oeuf_1_prix) {
        this.oeuf_1_prix = oeuf_1_prix;
    }

    public Integer getOeuf_2_hatch_time() {
        return oeuf_2_hatch_time;
    }

    public void setOeuf_2_hatch_time(Integer oeuf_2_hatch_time) {
        this.oeuf_2_hatch_time = oeuf_2_hatch_time;
    }

    public Integer getOeuf_2_prix() {
        return oeuf_2_prix;
    }

    public void setOeuf_2_prix(Integer oeuf_2_prix) {
        this.oeuf_2_prix = oeuf_2_prix;
    }

    public Integer getIncubateur_1_prix() {
        return incubateur_1_prix;
    }

    public void setIncubateur_1_prix(Integer incubateur_1_prix) {
        this.incubateur_1_prix = incubateur_1_prix;
    }

    public Integer getIncubateur_2_prix() {
        return incubateur_2_prix;
    }

    public void setIncubateur_2_prix(Integer incubateur_2_prix) {
        this.incubateur_2_prix = incubateur_2_prix;
    }
}
