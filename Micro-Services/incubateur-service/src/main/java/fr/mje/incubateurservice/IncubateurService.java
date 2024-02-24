package fr.mje.incubateurservice;

import fr.mje.incubateurservice.models.Incubateur;
import fr.mje.incubateurservice.repositories.IncubateurRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class IncubateurService {

    @Autowired
    private IncubateurRepository incubateurRepository;

    private final RabbitTemplate rabbitTemplate;

    public IncubateurService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(fixedDelay = 1000)
    public void incuberOeufs(){
        List<Incubateur> incubateurs = incubateurRepository.findByIsIncubing(true);
        for (Incubateur incubateur : incubateurs){
            Integer incubingTime = incubateur.getIncubingTime();
            if (incubingTime <= 0){
                rabbitTemplate.convertAndSend(IncubateurServiceApplication.topicExchangeName, "hatched-egg", "Un oeuf vient d'éclore !");
                incubateur.setIsIncubing(false);
            }else {
                incubateur.setIncubingTime(incubingTime-1);
            }
            incubateurRepository.save(incubateur);
        }
    }

    @GetMapping("/{message}")
    public String sendMessage(@PathVariable String message) {
        rabbitTemplate.convertAndSend(IncubateurServiceApplication.topicExchangeName, "hatched-egg", message);
        return "message sent" + message;
    }
}
