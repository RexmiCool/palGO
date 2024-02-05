package fr.mje.boutiqueservice.controller;

import fr.mje.boutiqueservice.models.Boutique;
import fr.mje.boutiqueservice.repositories.BoutiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BoutiqueController {

    @Autowired
    private BoutiqueRepository boutiqueRepository;

    @GetMapping("/boutique")
    public List<Boutique> getBoutique() {
        if (boutiqueRepository.findAll().size() == 0) {
            boutiqueRepository.save(new Boutique());
        }
        return boutiqueRepository.findAll();
    }

    @GetMapping("/generate_boutique")
    public List<Boutique> generate_boutique() {
        boutiqueRepository.deleteAll();
        boutiqueRepository.save(new Boutique());
        return boutiqueRepository.findAll();
    }





//    @GetMapping("/oeufs/{id}")
//    public ResponseEntity< Oeuf > getOeufById(@PathVariable(value = "id") Long oeufId)
//            throws ResourceNotFoundException {
//        Oeuf employee = oeufRepository.findById(oeufId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + oeufId));
//        return ResponseEntity.ok().body(employee);
//    }
}
