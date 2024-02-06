package fr.mje.heroservice.repositories;

import fr.mje.heroservice.models.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeroRepository extends JpaRepository<Hero, Long> { }
