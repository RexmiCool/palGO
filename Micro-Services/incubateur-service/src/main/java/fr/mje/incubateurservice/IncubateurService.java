package fr.mje.incubateurservice;

import fr.mje.incubateurservice.models.Incubateur;
import fr.mje.incubateurservice.repositories.IncubateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IncubateurService {

    @Autowired
    private IncubateurRepository incubateurRepository;
    @Scheduled(fixedDelay = 1000)
    public void incuberOeufs(){
        List<Incubateur> incubateurs = incubateurRepository.findByIsIncubing(true);
        for (Incubateur incubateur : incubateurs){
            Integer incubingTime = incubateur.getIncubingTime();
            if (incubingTime <= 0){
                incubateur.setIsIncubing(false);
            }else {
                incubateur.setIncubingTime(incubingTime-1);
            }
            incubateurRepository.save(incubateur);
        }
    }
}
