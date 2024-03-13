/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Servicios;

import com.example.AppServicios.Entidades.Persona;
import com.example.AppServicios.Repositorios.PersonaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaServicio {
    @Autowired
    PersonaRepositorio personaRepositorio;
    
@Transactional
    public Persona buscarPorEmail(String email) {
        Persona persona = personaRepositorio.buscarPorEmail(email);
      return persona;
  }
}
