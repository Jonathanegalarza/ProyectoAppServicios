/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

/**
 *
 * @author Ruben
 */
@Entity

public class Cliente extends Persona{

  /*
   La anotación @OneToMany con mappedBy = "cliente" indica que la relación está mapeada
   por la propiedad cliente en la clase Comentario. Esto significa que en la clase Comentario,
    debe haber una propiedad cliente que mapee la relación inversa.
   */
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

}
