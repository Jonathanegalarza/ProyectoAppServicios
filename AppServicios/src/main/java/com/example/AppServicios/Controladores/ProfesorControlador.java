/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package com.example.AppServicios.Controladores;

import com.example.AppServicios.Servicios.ProfesorServicio;
import com.example.Excepciones.MiException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/profesor")
public class ProfesorControlador {
    @Autowired
    ProfesorServicio profesorServicio;
    @GetMapping("/registrar")
    public String Profesor(){
        return "registrarProfesor.html";
    }
   @PostMapping("/registro")
    public String registro(String validador, String nombre, String apellido, String dni, String telefono,
            String direccion, String email, String password,String materia,String HorasDisponibles,String diasDiponibles,  
            ModelMap modelo, MultipartFile archivo, String password2) {
        try {

            profesorServicio.validar(nombre, apellido, dni, telefono, email, password, password2,direccion);

            modelo.put("nombre",nombre);
            modelo.put("apellido",apellido);
            modelo.put("dni", dni);
            modelo.put("telefono",telefono);
            modelo.put("email", email);
            modelo.put("password",password);
            modelo.put("password2",password2);
            modelo.put("direccion", direccion);
           
            

            return "registroDoble.html";

        } catch (MiException ex) {

            
            modelo.put("error", ex.getMessage());
            return "registroDoble.html";
        }

    }

                    }
