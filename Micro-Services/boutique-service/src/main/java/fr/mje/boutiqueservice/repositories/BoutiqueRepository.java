package fr.mje.boutiqueservice.repositories;

import fr.mje.boutiqueservice.models.Boutique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoutiqueRepository extends JpaRepository<Boutique, Long> {
    @Override
    void deleteAll();
}
