package fr.mje.monstreservice.models;
import jakarta.persistence.*;

@Entity
@Table(name = "monstre")
public class Monstre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer uid;
    private String name;


    public Monstre(String name, Integer uid) {
        this.name = name;
        this.uid = uid;
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
}
