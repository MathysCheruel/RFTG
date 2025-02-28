package com.toad.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.toad.entities.Director;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface DirectorRepository extends CrudRepository<Director, Integer> {
    @Query(value = """
        SELECT r.director_id AS directorId, 
               r.nom AS nom, 
               COUNT(f.film_id) AS nbFilms 
        FROM director r 
        LEFT JOIN film f ON r.director_id = f.id_director 
        WHERE r.nom = :nom AND r.prenom = :prenom 
        GROUP BY r.director_id, r.nom
        """, nativeQuery = true)
        Optional<Director.DirectorFilmCount> findRealisateurWithFilmCount(@Param("nom") String nom, @Param("prenom") String prenom);
}