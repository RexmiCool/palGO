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

    @GetMapping("/incubateur")
    public List<Incubateur> getIncubateur() {
        if (incubateurRepository.findAll().isEmpty()) {
            incubateurRepository.save(new Incubateur());
        }
        return incubateurRepository.findAll();
    }

//    @GetMapping("/generate_boutique")
//    public List<fr.mje.incubateurservice.models.Incubateur> generate_boutique() {
//        incubateurRepository.deleteAll();
//        incubateurRepository.save(new fr.mje.incubateurservice.models.Incubateur());
//        return incubateurRepository.findAll();
//    }





//    @GetMapping("/oeufs/{id}")
//    public ResponseEntity< Oeuf > getOeufById(@PathVariable(value = "id") Long oeufId)
//            throws ResourceNotFoundException {
//        Oeuf employee = oeufRepository.findById(oeufId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + oeufId));
//        return ResponseEntity.ok().body(employee);
//    }
}
