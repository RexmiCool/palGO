package fr.mje.incubateurservice.models;
import jakarta.persistence.*;

@Entity
@Table(name = "incubateur")
public class Incubateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer eggId;
    private Integer incubingTime;
        private Boolean isIncubing;
    private Integer uid;

    public Incubateur(Integer eggId, Integer incubingTime, Boolean isIncubing, Integer uid) {
        this.incubingTime = incubingTime;
        this.isIncubing = isIncubing;
        this.eggId = eggId;
        this.uid = uid;
    }

    public Incubateur() {

    }

    public void randomBoutique(){

    }

    public Integer getId() {
        return id;
    }

    public Integer getEggId() {
        return eggId;
    }

    public void setEggId(Integer eggId) {
        this.eggId = eggId;
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

}
