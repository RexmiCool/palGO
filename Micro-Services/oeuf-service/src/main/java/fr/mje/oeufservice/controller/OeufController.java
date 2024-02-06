package fr.mje.oeufservice.controller;

import fr.mje.oeufservice.models.Oeuf;
import fr.mje.oeufservice.repositories.OeufRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OeufController {

    @Autowired
    private OeufRepository oeufRepository;

    @GetMapping("/oeuf/{uid}")
    public List<Oeuf> getoeuf(@PathVariable(value = "uid") Integer uid) {
        return oeufRepository.findByUid(uid);
    }

    @GetMapping("/add_oeuf/{hatch_time}/{prix}/{uid}")
    public List<Oeuf> add_oeuf(@PathVariable(value = "hatch_time") Integer hatch_time, @PathVariable(value = "prix") Integer prix, @PathVariable(value = "uid") Integer uid) {
        oeufRepository.save(new Oeuf(hatch_time,prix,uid));
        return oeufRepository.findByUid(uid);
    }

    @GetMapping("/remove_oeuf/{id}/{uid}")
    public List<Oeuf> remove_oeuf(@PathVariable(value = "id") Long oeufId, @PathVariable(value = "uid") Integer uid){
        oeufRepository.delete(oeufRepository.getById(oeufId));
        return oeufRepository.findByUid(uid);
    }





//    @GetMapping("/oeufs/{id}")
//    public ResponseEntity< Oeuf > getOeufById(@PathVariable(value = "id") Long oeufId)
//            throws ResourceNotFoundException {
//        Oeuf employee = oeufRepository.findById(oeufId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + oeufId));
//        return ResponseEntity.ok().body(employee);
//    }
}
