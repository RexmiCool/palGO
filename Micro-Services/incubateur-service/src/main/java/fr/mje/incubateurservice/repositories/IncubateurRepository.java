package fr.mje.incubateurservice.repositories;

import fr.mje.incubateurservice.models.Incubateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncubateurRepository extends JpaRepository<Incubateur, Long> {

}
