package fr.mje.heroservice.controller;

import fr.mje.heroservice.models.Hero;
import fr.mje.heroservice.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HeroController {

    @Autowired
    private HeroRepository heroRepository;

    @GetMapping("/hero")
    public List<Hero> gethero() {
        return heroRepository.findAll();
    }

    @GetMapping("/hero_money/{id}")
    public Integer gethero_money(@PathVariable(value = "id") Long heroId) {
        return heroRepository.getById(heroId).getMoney();
    }

    @GetMapping("/hero_money_add/{id}/{value}")
    public Integer gethero_money_add(@PathVariable(value = "id") Long heroId, @PathVariable(value = "value") Integer value) {
        Hero hero = heroRepository.getById(heroId);
        hero.setMoney(hero.getMoney()+value);
        heroRepository.save(hero);
        return heroRepository.getById(heroId).getMoney();
    }

    @GetMapping("/add_hero/{name}")
    public List<Hero> add_hero(@PathVariable(value = "name") String name) {
        heroRepository.save(new Hero(name));
        return heroRepository.findAll();
    }

    @GetMapping("/remove_hero/{id}")
    public List<Hero> remove_hero(@PathVariable(value = "id") Long heroId){
        heroRepository.delete(heroRepository.getById(heroId));
        return heroRepository.findAll();
    }

}
