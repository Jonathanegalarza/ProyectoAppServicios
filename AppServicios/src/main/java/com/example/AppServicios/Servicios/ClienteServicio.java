/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Servicios;

import com.example.AppServicios.Entidades.Cliente;
import com.example.AppServicios.Repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
public class ClienteServicio {
    @Autowired
    ClienteRepositorio clienteRepositorio;
    
    public Cliente buscarPorEmail(String email) {
        Cliente cliente = clienteRepositorio.buscarPorEmail(email);
        return cliente;
    }
    
}
