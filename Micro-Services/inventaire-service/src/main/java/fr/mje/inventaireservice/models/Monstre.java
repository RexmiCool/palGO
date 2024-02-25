package fr.mje.inventaireservice.models;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static fr.mje.inventaireservice.models.Monster.genererMonsterAleatoire;



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

    public Monstre(Integer uid) {
        List<Monster> Monsters = new ArrayList<>();

        Monsters.add(new Monster("Pikachu", 25, 45, 55, 80));
        Monsters.add(new Monster("Evoli", 45, 65, 55, 75));
        Monsters.add(new Monster("Dracaufeu", 55, 75, 65, 100));
        Monsters.add(new Monster("Miaouss", 30, 50, 45, 70));
        Monsters.add(new Monster("Salameche", 29, 49, 60, 85));
        Monsters.add(new Monster("Carapuce", 34, 54, 50, 75));
        Monsters.add(new Monster("Bulbizarre", 35, 55, 45, 65));
        Monsters.add(new Monster("Mewtwo", 96, 116, 100, 154));

        Monster MonsterAleatoire = genererMonsterAleatoire(Monsters);

        this.name = MonsterAleatoire.getNom();
        this.uid = uid;
        this.health = MonsterAleatoire.getPvMin();
        this.damage = MonsterAleatoire.getDegatsMin();
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
