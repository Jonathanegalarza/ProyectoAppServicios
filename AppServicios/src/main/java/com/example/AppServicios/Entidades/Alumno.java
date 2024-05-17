
package com.example.AppServicios.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity

public class Alumno extends Persona{
  /*
   La anotación @OneToMany con mappedBy = "alumno" indica que la relación está mapeada
   por la propiedad alumno en la clase Comentario. Esto significa que en la clase Comentario,
    debe haber una propiedad alumno que mapee la relación inversa.
   */
    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL)
    private List<Comentario>comentarios ;

}
