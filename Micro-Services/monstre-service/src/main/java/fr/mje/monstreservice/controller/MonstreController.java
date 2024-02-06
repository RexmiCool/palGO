package fr.mje.monstreservice.controller;

import fr.mje.monstreservice.models.Monstre;
import fr.mje.monstreservice.repositories.MonstreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MonstreController {

    @Autowired
    private MonstreRepository monstreRepository;

    @GetMapping("/monstre/{uid}")
    public List<Monstre> getmonstre(@PathVariable(value = "uid") Integer uid) {
        return monstreRepository.findByUid(uid);
    }

    @GetMapping("/add_monstre/{name}/{uid}")
    public List<Monstre> add_monstre(@PathVariable(value = "name") String name, @PathVariable(value = "uid") Integer uid) {
        monstreRepository.save(new Monstre(name ,uid));
        return monstreRepository.findByUid(uid);
    }

    @GetMapping("/remove_monstre/{id}/{uid}")
    public List<Monstre> remove_monstre(@PathVariable(value = "id") Long monstreId, @PathVariable(value = "uid") Integer uid){
        monstreRepository.delete(monstreRepository.getById(monstreId));
        return monstreRepository.findByUid(uid);
    }

}
