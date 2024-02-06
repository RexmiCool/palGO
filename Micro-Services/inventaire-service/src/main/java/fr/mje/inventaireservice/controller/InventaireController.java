package fr.mje.inventaireservice.controller;

import fr.mje.inventaireservice.models.Monstre;
import fr.mje.inventaireservice.repositories.InventaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class InventaireController {

    @Autowired
    private InventaireRepository inventaireRepository;

    @GetMapping("/inventaire/{uid}")
    public List<Monstre> getinventaire(@PathVariable(value = "uid") Integer uid) {
        return inventaireRepository.findByUid(uid);
    }

    @GetMapping("/add_monstre_inventaire/{name}/{uid}")
    public List<Monstre> add_monstre_inventaire(@PathVariable(value = "name") String name, @PathVariable(value = "uid") Integer uid) {
        if (inventaireRepository.findByUid(uid).size() < 5 ) {
            inventaireRepository.save(new Monstre(name ,uid));
        }
        return inventaireRepository.findByUid(uid);
    }

    @GetMapping("/remove_monstre_inventaire/{id}/{uid}")
    public List<Monstre> remove_monstre_inventaire(@PathVariable(value = "id") Long monstreId, @PathVariable(value = "uid") Integer uid){
        inventaireRepository.delete(inventaireRepository.getById(monstreId));
        return inventaireRepository.findByUid(uid);
    }

}
