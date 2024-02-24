package fr.mje.incubateurservice.controller;

import fr.mje.incubateurservice.models.Incubateur;
import fr.mje.incubateurservice.repositories.IncubateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class IncubateurController {

    @Autowired
    private IncubateurRepository incubateurRepository;

    @GetMapping("/{uid}")
    public List<Incubateur> getIncubateur(@PathVariable(value = "uid") Integer uid) {
        return incubateurRepository.findByUid(uid);
    }

    @PostMapping("/")
    public void add_inc(@RequestBody Incubateur incubateur) {
        incubateurRepository.save(incubateur);
    }

    @DeleteMapping("/{id}")
    public void remove_inc(@PathVariable(value = "id") Long incubateur_id) {
        incubateurRepository.deleteById(incubateur_id);
    }

    @PutMapping("/")
    public void update_inc(@RequestBody Incubateur incubateur) {
        incubateurRepository.save(incubateur);
    }
}
