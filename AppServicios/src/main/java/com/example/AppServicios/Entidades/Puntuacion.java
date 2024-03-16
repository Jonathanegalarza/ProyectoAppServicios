package com.example.AppServicios.Entidades;

/// la puntuacion es un objero dado que debe relacionarce segun el profesor con las distintas materia

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity

public class Puntuacion {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "profesor_id")
        private Profesor profesor;

        private Integer puntuacion;

    }



    

