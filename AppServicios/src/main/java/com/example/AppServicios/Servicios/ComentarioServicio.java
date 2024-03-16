package com.example.AppServicios.Servicios;

import com.example.AppServicios.Entidades.Profesor;
import com.example.AppServicios.Repositorios.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComentarioServicio {
@Autowired
    ProfesorRepositorio profesorRepositorio;
    /*
    Con estos cambios, cuando busques un profesor y accedas a la lista de puntuaciones, tendrás todas las puntuaciones individuales dadas por los clientes que solicitaron el servicio del profesor.

    Aquí tienes un ejemplo de cómo podrías usar esto:

    java
    Copy code
    // Obtener el profesor de alguna manera (por ejemplo, desde el repositorio)

     */
    public void obtenerProfesor(Long profesorId) {
        Profesor profesor = profesorRepositorio.findById(profesorId).orElse(null);

        if (profesor != null) {
           // List<Integer> puntuaciones = profesor.getPuntuaciones();

            // Ahora puedes mostrar todas las puntuaciones individuales de los clientes
        }
    }
}
