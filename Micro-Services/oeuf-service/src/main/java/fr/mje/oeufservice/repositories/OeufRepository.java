package fr.mje.oeufservice.repositories;

import fr.mje.oeufservice.models.Oeuf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OeufRepository extends JpaRepository<Oeuf, Long> {
    List<Oeuf> findByUid(Integer uid);
}
