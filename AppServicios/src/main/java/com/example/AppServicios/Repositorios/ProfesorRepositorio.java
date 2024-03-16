
package com.example.AppServicios.Repositorios;

import com.example.AppServicios.Entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ruben
 */
@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Long>{
   
    @Query("SELECT p FROM Profesor p WHERE p.email = :email")
    public Profesor buscarPorEmail(@Param("email") String email);
     Optional<Profesor> findById(Long profesorId);
     boolean existsByDni(String dni);
     boolean existsByEmail(String email);
 
     
     
     
}
