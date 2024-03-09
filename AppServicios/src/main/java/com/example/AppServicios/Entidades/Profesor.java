package com.example.AppServicios.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author Ruben
 */
@Entity
@Data
public class Profesor extends Persona {

    private String horasDisponible;
    private String diasDisponibles;

    @OneToMany
    private Materia materia;
    @OneToOne
    private Imagen imagen;
    

}
