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
        if (incubateurRepository.findByUid(uid).isEmpty()) {
            incubateurRepository.save(new Incubateur(null, 13, false, uid));
        }
        return incubateurRepository.findByUid(uid);
    }

//    @GetMapping("/{uid}")
//    public List<Incubateur> getIncubateur(@PathVariable(value = "uid") Integer uid) {
//        return incubateurRepository.findByUid(uid);
//    }


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
