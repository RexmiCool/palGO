package fr.mje.heroservice.controller;

import fr.mje.heroservice.models.Hero;
import fr.mje.heroservice.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class HeroController {

    @Autowired
    private HeroRepository heroRepository;

    @GetMapping("/")
    public List<Hero> gethero() {
        return heroRepository.findAll();
    }

    @PostMapping("/")
    public void add_hero(@RequestBody Hero hero) {
        heroRepository.save(hero);
    }

    @DeleteMapping("/{id}")
    public void remove_hero(@PathVariable(value = "id") Long heroId) {
        heroRepository.deleteById(heroId);
    }

    @PutMapping("/")
    public void update_hero(@RequestBody Hero hero) {
        heroRepository.save(hero);
    }

}
