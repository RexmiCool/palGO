package fr.mje.incubateurservice.models;
import jakarta.persistence.*;

@Entity
@Table(name = "incubateur")
public class Incubateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer incubingTime;
    private Boolean isIncubing;
    private Integer uid;

    public Incubateur(Integer uid) {
        this.uid = uid;
        this.isIncubing = false;
    }

    public Incubateur() {
    }

    public void randomBoutique(){

    }

    public Integer getId() {
        return id;
    }

    public Integer getIncubingTime() {
        return incubingTime;
    }

    public void setIncubingTime(Integer incubingTime) {
        this.incubingTime = incubingTime;
    }

    public Boolean getIsIncubing() {
        return isIncubing;
    }

    public void setIsIncubing(Boolean isIncubing) {
        this.isIncubing = isIncubing;
    }

    public Integer getUID() {
        return uid;
    }

    public void setUID(Integer UID) {
        this.uid = UID;
    }

}
