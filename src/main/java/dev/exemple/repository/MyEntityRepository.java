package dev.exemple.repository;

import dev.exemple.entite.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author formation
 */
public interface MyEntityRepository extends JpaRepository<MyEntity, Integer> {
    
}
