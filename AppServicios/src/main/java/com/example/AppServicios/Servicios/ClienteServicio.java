
package com.example.AppServicios.Servicios;

import com.example.Excepciones.MiException;
import com.example.AppServicios.Entidades.Cliente;
import com.example.AppServicios.Enumeraciones.Rol;
import com.example.AppServicios.Repositorios.ClienteRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteServicio {
    @Autowired
    ClienteRepositorio clienteRepositorio;
    
//    public Cliente buscarPorEmail(String email) {
//        Cliente cliente = clienteRepositorio.buscarPorEmail(email);
//        return cliente;
//    }
    
    
    
    @Transactional
    public void crearCliente(String nombre, String apellido, String domicilio, String dni, String email, String password, String password2, String telefono) throws MiException{
    validar(nombre, apellido, dni, telefono, email, password, password2, domicilio);
        
        Cliente cliente = new Cliente();
        cliente.setApellido(apellido);
        cliente.setAlta(true);
        cliente.setNombre(nombre);
        cliente.setDireccion(domicilio);
        cliente.setDni(dni);
        cliente.setEmail(email);
        cliente.setFechaAlta(new Date());
//        cliente.setFechaNacimiento(fechaNacimiento);
        cliente.setId(Long.MIN_VALUE);
//        cliente.setImagen(imagen);
        cliente.setPassword(password);
        cliente.setRol(Rol.ADMIN);
        cliente.setAlta(true);
       
        clienteRepositorio.save(cliente);
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

        if (clienteRepositorio.existsByDni(dni)) {
            throw new MiException("El DNI ya está registrado en el sistema");
        }

        if (telefono.isEmpty() || telefono == null) {
            throw new MiException("El Telefono no puede ser nulo o estar vacio");
        }
        if (email.isEmpty() || email == null) {
            throw new MiException("el Email no puede ser nulo o estar vacio");
        }
        if (clienteRepositorio.existsByEmail(email)) {
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
