package fr.mje.inventaireservice.controller;

import fr.mje.inventaireservice.models.Monstre;
import fr.mje.inventaireservice.repositories.InventaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class InventaireController {

    @Autowired
    private InventaireRepository inventaireRepository;

    @GetMapping("/{uid}")
    public List<Monstre> getinventaire(@PathVariable(value = "uid") Integer uid) {
        return inventaireRepository.findByUid(uid);
    }

    @PostMapping("/")
    public void add_monstre_inventaire(@RequestBody Monstre monstre) {
        if (inventaireRepository.findByUid(monstre.getUid()).size() < 6 ) {
            inventaireRepository.save(monstre);
        }
    }

    @DeleteMapping("/{id}")
    public void remove_monstre_inventaire(@PathVariable(value = "id") Long monstreId) {
        inventaireRepository.deleteById(monstreId);
    }

}
