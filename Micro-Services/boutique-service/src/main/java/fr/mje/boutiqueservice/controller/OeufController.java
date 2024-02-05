package fr.mje.boutiqueservice.controller;

import fr.mje.boutiqueservice.Oeuf;
import fr.mje.boutiqueservice.repositories.OeufRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OeufController {
    @Autowired
    private OeufRepository oeufRepository;

    @GetMapping("/oeufs")
    public List<Oeuf> getAllOeufs() {
        return oeufRepository.findAll();
    }

//    @GetMapping("/oeufs/{id}")
//    public ResponseEntity< Oeuf > getOeufById(@PathVariable(value = "id") Long oeufId)
//            throws ResourceNotFoundException {
//        Oeuf employee = oeufRepository.findById(oeufId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + oeufId));
//        return ResponseEntity.ok().body(employee);
//    }
}
