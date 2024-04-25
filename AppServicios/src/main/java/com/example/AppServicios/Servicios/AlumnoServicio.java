
package com.example.AppServicios.Servicios;

import com.example.Excepciones.MiException;
import com.example.AppServicios.Entidades.Alumno;
import com.example.AppServicios.Enumeraciones.Rol;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.AppServicios.Repositorios.AlumnoRepositorio;


@Service
public class AlumnoServicio {
    @Autowired
    AlumnoRepositorio alumnoRepositorio;
    
//    public Alumno buscarPorEmail(String email) {
//        Alumno alumno = alumnoRepositorio.buscarPorEmail(email);
//        return alumno;
//    }
    
    
    
    @Transactional
    public void crearCliente(String nombre, String apellido, String domicilio, String dni, String email, String password, String password2, String telefono) throws MiException{
    validar(nombre, apellido, dni, telefono, email, password, password2, domicilio);
        
        Alumno alumno = new Alumno();
        alumno.setApellido(apellido);
        alumno.setAlta(true);
        alumno.setNombre(nombre);
        alumno.setDireccion(domicilio);
        alumno.setDni(dni);
        alumno.setEmail(email);
        alumno.setFechaAlta(new Date());
//        alumno.setFechaNacimiento(fechaNacimiento);
        alumno.setId(Long.MIN_VALUE);
//        alumno.setImagen(imagen);
        alumno.setPassword(password);
        alumno.setRol(Rol.ADMIN);
        alumno.setAlta(true);
       
        alumnoRepositorio.save(alumno);
    }
    
    
    
     @Transactional
    public void validar(String nombre, String apellido, String dni, String telefono, String email, String password,
            String password2, String domicilio) throws MiException {

        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("el Nombre no puede ser nulo o estar vacío");
        }

        //INVErtir todos para evitar el error en amarillo
        if (apellido == null || apellido.isEmpty()) {
            throw new MiException("El Apellido no puede ser nulo o estar vacio");
        }

        if (domicilio.isEmpty() || domicilio == null) {
            throw new MiException("El domicilio no puede ser nulo o estar vacio");
        }

        if (dni.isEmpty() || dni == null) {
            throw new MiException("El DNI no puede ser nulo o estar vacio");
        }

        if (alumnoRepositorio.existsByDni(dni)) {
            throw new MiException("El DNI ya está registrado en el sistema");
        }

        if (telefono.isEmpty() || telefono == null) {
            throw new MiException("El Telefono no puede ser nulo o estar vacio");
        }
        if (email.isEmpty() || email == null) {
            throw new MiException("el Email no puede ser nulo o estar vacio");
        }
        if (alumnoRepositorio.existsByEmail(email)) {
            throw new MiException("El Email ya se encuentra registrado en el sistema");
        }
        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new MiException("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");

            // para mas adelante hacer un validador de contarseñas ejemplo que no se a000000
            // 123456 etc
        }
}
   public void validarPuntuacion(int calificacion){

        if(calificacion>0 && calificacion<=5){


        }
   }

}
