/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Repositorios;

import com.example.AppServicios.Entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 * @author Ruben
 */
@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Long>{
//    @Query ("SELECT pr FROM profesor pr WHERE pr.email = :email")
//    public Profesor buscarPorEmail(@Param("email")String email);
     Optional<Profesor> findById(Long profesorId);

}
