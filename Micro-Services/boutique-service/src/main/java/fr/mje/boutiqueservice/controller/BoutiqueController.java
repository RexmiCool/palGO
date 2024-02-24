package fr.mje.boutiqueservice.controller;

import fr.mje.boutiqueservice.models.Boutique;
import fr.mje.boutiqueservice.repositories.BoutiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class BoutiqueController {

    @Autowired
    private BoutiqueRepository boutiqueRepository;

    @GetMapping("/")
    public List<Boutique> getBoutique() {
        if (boutiqueRepository.findAll().isEmpty()) {
            boutiqueRepository.save(new Boutique());
        }
        return boutiqueRepository.findAll();
    }
}
