
package com.example.AppServicios.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

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
