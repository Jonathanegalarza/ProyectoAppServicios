
package com.example.AppServicios.Servicios;

import com.example.AppServicios.Entidades.Imagen;
import com.example.Excepciones.MiException;
import com.example.AppServicios.Entidades.Profesor;
import com.example.AppServicios.Enumeraciones.Rol;
import com.example.AppServicios.Repositorios.ProfesorRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfesorServicio {
     @Autowired
   ProfesorRepositorio profesorRepositorio;
    
    public Profesor buscarPorEmail(String email) {
        Profesor profesor = profesorRepositorio.buscarPorEmail(email);
        return profesor;
    }

@Transactional
public void validar(String nombre, String apellido, String dni, String telefono, String email, String password,
                    String password2, String domicilio) throws MiException {

    if (nombre == null || nombre.isEmpty()) {
        throw new MiException("El Nombre no puede ser nulo o estar vacío");
    }

    if (apellido == null || apellido.isEmpty()) {
        throw new MiException("El Apellido no puede ser nulo o estar vacío");
    }

    if (domicilio == null || domicilio.isEmpty()) {
        throw new MiException("El domicilio no puede ser nulo o estar vacío");
    }

    if (dni == null || dni.isEmpty()) {
        throw new MiException("El DNI no puede ser nulo o estar vacío");
    }

    if (profesorRepositorio.existsByDni(dni)) {
        throw new MiException("El DNI ya está registrado en el sistema");
    }

    if (telefono == null || telefono.isEmpty()) {
        throw new MiException("El Teléfono no puede ser nulo o estar vacío");
    }

    if (email == null || email.isEmpty()) {
        throw new MiException("El Email no puede ser nulo o estar vacío");
    }

    if (profesorRepositorio.existsByEmail(email)) {
        throw new MiException("El Email ya se encuentra registrado en el sistema");
    }

    if (password == null || password.isEmpty() || password.length() <= 5) {
        throw new MiException("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");
    }

    
    if (!password.equals(password2)) {
        throw new MiException("Las contraseñas no coinciden");
    }

    
}
    
     @Transactional
        public void crearProfesor(String nombre, String apellido, String domicilio, String dni, String email, String password, String password2, String telefono, Date fechaNacimiento,
                Imagen imagen) throws MiException{
    
        validar(nombre, apellido, dni, telefono, email, password, password2, domicilio);
        Profesor profesor = new Profesor();
        
        profesor.setAlta(true);
        profesor.setApellido(apellido);
//        profesor.setComentarios(comentarios);
        profesor.setDiasDisponibles(password2);
        profesor.setDireccion(domicilio);
        profesor.setDni(dni);
        profesor.setEmail(email);
        profesor.setFechaAlta(new Date());
        profesor.setFechaNacimiento(fechaNacimiento);
        profesor.setHorasDisponible(password2);
        profesor.setId(Long.MIN_VALUE);
       profesor.setImagen(imagen);
//        profesor.setMateria(materia);
        profesor.setNombre(nombre);
        profesor.setPassword(password);
        profesor.setRol(Rol.ADMIN);
        profesor.setTelefono(telefono);
        
       
        profesorRepositorio.save(profesor);
}
     }
