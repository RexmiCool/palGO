package fr.mje.incubateurservice.repositories;

import fr.mje.incubateurservice.models.Incubateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IncubateurRepository extends JpaRepository<Incubateur, Long> {
    List<Incubateur> findByUid(Integer uid);
    List<Incubateur> findByIsIncubing(Boolean isIncubing);
}
