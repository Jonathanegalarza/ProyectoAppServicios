/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Repositorios;

import com.example.AppServicios.Entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ruben
 */
@Repository
public interface PersonaRepositorio extends JpaRepository<Persona,String>{


    @Query ("SELECT p  from persona p where p.email = :email")
    public Persona buscarPorEmail(@Param("email")String email);
}

