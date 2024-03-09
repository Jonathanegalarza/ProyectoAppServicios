/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Repositorios;

import com.example.AppServicios.Entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ruben
 */
@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, String>{
    @Query ("SELECT pr  from profesor pr where pr.email = :email")
    public Profesor buscarPorEmail(@Param("email")String email);
}
