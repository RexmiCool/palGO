package fr.mje.boutiqueservice;

import fr.mje.boutiqueservice.models.Boutique;
import fr.mje.boutiqueservice.repositories.BoutiqueRepository;
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
public class BoutiqueService {

    @Autowired
    private BoutiqueRepository boutiqueRepository;

    @Scheduled(fixedDelay = 60000)
    public void refreshBoutique(){
        boutiqueRepository.deleteAll();
    }
}
