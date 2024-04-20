/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador {
    
  
    
    @GetMapping("/inicio")
     public String inicio() {
        return "inicio.html";
    }
    @GetMapping("/registrar")
    public String Profesor(){
        return "registrarProfesor.html";
    }
}
