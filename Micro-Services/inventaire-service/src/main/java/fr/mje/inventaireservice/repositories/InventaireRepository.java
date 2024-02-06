package fr.mje.inventaireservice.repositories;

import fr.mje.inventaireservice.models.Monstre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventaireRepository extends JpaRepository<Monstre, Long> {
    List<Monstre> findByUid(Integer uid);
}
