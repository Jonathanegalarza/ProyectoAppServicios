/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import com.example.AppServicios.Enumeraciones.Rol;

/**
 *

 */
@Entity
@Data
public class Persona {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private Long id;

    private String dni;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String telefono;
    private String email;
    private String direccion;
    private String password;
    @Temporal(TemporalType.DATE)
    private Date fechaAlta; //alta del usuario
    private boolean alta;
    
   @Enumerated(EnumType.STRING)
    private Rol rol;
}
