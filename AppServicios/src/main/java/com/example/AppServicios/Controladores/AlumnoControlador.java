package com.example.AppServicios.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoControlador {
    
    
    @GetMapping("/registrar")
    public String Profesor(){
        return  "registrarAlumno.html";
    }
}
