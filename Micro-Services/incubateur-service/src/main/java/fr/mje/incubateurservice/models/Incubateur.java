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
    private Boolean isReady;

    public Incubateur(Integer uid) {
        this.uid = uid;
        this.isIncubing = false;
        this.incubingTime = null;
        this.isReady = false;
    }

    public Incubateur() {
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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Boolean getReady() {
        return this.isReady;
    }

    public void setReady(Boolean isReady) {
        this.isReady = isReady;
    }
}
