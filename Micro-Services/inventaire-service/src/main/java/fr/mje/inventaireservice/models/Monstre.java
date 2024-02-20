package fr.mje.inventaireservice.models;
import jakarta.persistence.*;

@Entity
@Table(name = "inventaire")
public class Monstre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer uid;
    private String name;
    private Integer health;
    private Integer damage;


    public Monstre(String name, Integer uid, Integer health, Integer damage) {
        this.name = name;
        this.uid = uid;
        this.health = health;
        this.damage = damage;
    }

    public Monstre() { }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
