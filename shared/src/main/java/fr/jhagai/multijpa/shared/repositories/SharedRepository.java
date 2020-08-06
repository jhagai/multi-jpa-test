package fr.jhagai.multijpa.shared.repositories;

import fr.jhagai.multijpa.shared.entities.SharedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SharedRepository extends JpaRepository<SharedEntity, Long> {
}
