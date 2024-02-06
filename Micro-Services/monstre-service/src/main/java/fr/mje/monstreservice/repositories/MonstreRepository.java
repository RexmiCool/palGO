package fr.mje.monstreservice.repositories;

import fr.mje.monstreservice.models.Monstre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonstreRepository extends JpaRepository<Monstre, Long> {
    List<Monstre> findByUid(Integer uid);
}
