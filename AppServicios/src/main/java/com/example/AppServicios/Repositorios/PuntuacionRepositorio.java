
package com.example.AppServicios.Repositorios;


import com.example.AppServicios.Entidades.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntuacionRepositorio extends JpaRepository<Puntuacion, Long>{
    
    
    
}
