package fr.jhagai.multijpa.main.repositories;

import fr.jhagai.multijpa.main.entities.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends JpaRepository<MainEntity, Long> {
}
