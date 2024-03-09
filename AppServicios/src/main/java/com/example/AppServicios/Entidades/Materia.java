
package com.example.AppServicios.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;


 @Data
@Entity

public class Materia {


    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idMateria;
    private String descripcion;//Detalle de la materia
    private String nombreMateria;
    private Double precio;//precio por hora

    private Puntuacion puntuacion;
}
   

