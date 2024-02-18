package fr.mje.monstreservice.controller;

import fr.mje.monstreservice.models.Monstre;
import fr.mje.monstreservice.repositories.MonstreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class MonstreController {

    @Autowired
    private MonstreRepository monstreRepository;

    @GetMapping("/{uid}")
    public List<Monstre> getmonstre(@PathVariable(value = "uid") Integer uid) {
        return monstreRepository.findByUid(uid);
    }

    @PostMapping("/")
    public void add_monstre(@RequestBody Monstre monstre) {
        monstreRepository.save(monstre);
    }

    @DeleteMapping("/{id}")
    public void remove_monstre(@PathVariable(value = "id") Long monstreId) {
        monstreRepository.deleteById(monstreId);
    }

}
