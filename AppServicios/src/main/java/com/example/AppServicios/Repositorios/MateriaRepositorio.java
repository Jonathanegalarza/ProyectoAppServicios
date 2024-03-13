
package com.example.AppServicios.Repositorios;

import com.example.AppServicios.Entidades.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface MateriaRepositorio extends JpaRepository<Materia, String>{
   
    
}
