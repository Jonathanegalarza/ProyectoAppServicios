package com.example.AppServicios.Entidades;

import jakarta.persistence.*;
import lombok.Data;

/*
En este código, la clase Comentario tiene dos relaciones @ManyToOne: una con la clase Alumno y
 otra con la clase Profesor. Cada una de estas relaciones está mapeada a través de una columna
 de clave foránea (cliente_id y profesor_id, respectivamente) en la tabla de la entidad Comentario.
  Esto permite que un comentario esté asociado con un cliente y un profesor.
 */
@Data
@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Alumno cliente;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

   // private int puntuacion; // Puntuación dada por el cliente
}
