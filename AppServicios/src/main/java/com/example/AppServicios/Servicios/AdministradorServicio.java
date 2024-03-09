/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Servicios;

import com.example.AppServicios.Entidades.Administrador;
import com.example.AppServicios.Repositorios.AdministradorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
public class AdministradorServicio {
 @Autowired
   AdministradorRepositorio administradorRepositorio;
    
    public Administrador buscarPorEmail(String email) {
        Administrador cliente = administradorRepositorio.buscarPorEmail(email);
        return cliente;
    }    
}
