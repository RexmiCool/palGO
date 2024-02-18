package fr.mje.oeufservice.controller;

import fr.mje.oeufservice.models.Oeuf;
import fr.mje.oeufservice.repositories.OeufRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class OeufController {

    @Autowired
    private OeufRepository oeufRepository;

    @GetMapping("/{uid}")
    public List<Oeuf> getoeuf(@PathVariable(value = "uid") Integer uid) {
        return oeufRepository.findByUid(uid);
    }

    @PostMapping("/")
    public void add_oeuf(@RequestBody Oeuf oeuf) {
        oeufRepository.save(oeuf);
    }

    @DeleteMapping("/{id}")
    public void remove_oeuf(@PathVariable(value = "id") Long oeufId) {
        oeufRepository.deleteById(oeufId);
    }


//    @GetMapping("/oeufs/{id}")
//    public ResponseEntity< Oeuf > getOeufById(@PathVariable(value = "id") Long oeufId)
//            throws ResourceNotFoundException {
//        Oeuf employee = oeufRepository.findById(oeufId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + oeufId));
//        return ResponseEntity.ok().body(employee);
//    }
}
