/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package com.example.AppServicios.Controladores;

import com.example.AppServicios.Entidades.Imagen;
import com.example.AppServicios.Servicios.ProfesorServicio;
import com.example.Excepciones.MiException;
import java.util.Date;
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
    public String registro(String nombre, String apellido, String domicilio, String dni, String email, String password, String password2, String telefono, Date fechaNacimiento,
                Imagen imagen,String horasDisponibles,String diasDisponibles, ModelMap modelo, MultipartFile archivo, String materia) {
        try {

            profesorServicio.crearProfesor(nombre, apellido, email, dni, email, password, password2, telefono, fechaNacimiento, imagen);

            modelo.put("nombre",nombre);
            modelo.put("apellido",apellido);
            modelo.put("dni", dni);
            modelo.put("telefono",telefono);
            modelo.put("email", email);
            modelo.put("password",password);
            modelo.put("password2",password2);
            modelo.put("domicilio", domicilio);
            modelo.put("materia", materia);
            modelo.put("horasDisponibles", horasDisponibles);
            modelo.put("diasDisponibles", diasDisponibles);
             
           
            

            return "registroDoble.html";

        } catch (MiException ex) {

            
            modelo.put("error", ex.getMessage());
            return "registroDoble.html";
        }

    }

                    }
