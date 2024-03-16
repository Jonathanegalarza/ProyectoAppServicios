
package com.example.AppServicios.Repositorios;

import com.example.AppServicios.Entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{
    
    @Query ("SELECT c FROM Cliente c WHERE c.email = :email")
    public Cliente buscarPorEmail(@Param("email")String email);
    boolean existsByDni(String dni);
    boolean existsByEmail(String email);
    
}
