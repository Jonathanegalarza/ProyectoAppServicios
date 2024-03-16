/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Entidades;

import jakarta.persistence.*;

import java.util.Date;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import com.example.AppServicios.Enumeraciones.Rol;

/**
 *
 * @author Ruben..
 */
@Entity
@Data
public class Persona {

    @Id
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

    @OneToOne
    private Imagen imagen;
   
}
