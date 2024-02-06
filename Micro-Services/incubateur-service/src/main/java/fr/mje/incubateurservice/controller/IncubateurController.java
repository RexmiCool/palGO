package fr.mje.incubateurservice.controller;

import fr.mje.incubateurservice.models.Incubateur;
import fr.mje.incubateurservice.repositories.IncubateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class IncubateurController {

    @Autowired
    private IncubateurRepository incubateurRepository;

    @GetMapping("/incubateur/{uid}")
    public List<Incubateur> getIncubateur(@PathVariable(value = "uid") Integer uid) {
        return incubateurRepository.findByUid(uid);
    }

    @GetMapping("/createIncubateur/{uid}")
    public List<Incubateur> createIncubateur(@PathVariable(value = "uid") Integer uid) {
        if (incubateurRepository.findByUid(uid).size() < 6) {
            incubateurRepository.save(new Incubateur(uid));
        }
        return incubateurRepository.findByUid(uid);
    }

    @GetMapping("/incubeOeuf/{uid}/{hatchTime}")
    public List<Incubateur> incubeOeuf(@PathVariable(value = "uid") Integer uid, @PathVariable(value = "hatchTime") Integer hatchTime) {
        List<Incubateur> incubateurs = incubateurRepository.findByIsIncubing(false);
        if (!incubateurs.isEmpty()) {
            Incubateur incubateur = incubateurs.getFirst();
            incubateur.setIncubingTime(hatchTime);
            incubateur.setIsIncubing(true);
            incubateurRepository.save(incubateur);
        }

        return incubateurRepository.findByUid(uid);
    }
}
