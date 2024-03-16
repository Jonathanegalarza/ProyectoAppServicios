package com.example.AppServicios.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;

@Data
@Entity

public class Profesor extends Persona {

    private String horasDisponible;
    private String diasDisponibles;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
    private List<Puntuacion> puntuaciones; // Lista de puntuaciones dadas por clientes
/*
    @OneToMany
    private List<Materia> materia;

 *MappedBy*: Este atributo especifica el campo de la clase 'Materia' que posee la relación con la clase
 'Profesor'. En este caso, 'mappedBy = "profesor"' indica que el campo 'profesor' de la clase 'Materia'
 es el responsable de gestionar la relación. Esto significa que los cambios en la relación, como agregar
 o quitar una 'Materia' de un 'Profesor', deben reflejarse actualizando el campo 'profesor' en la clase 'Materia'

**CascadeType.ALL**: Este atributo especifica el comportamiento en cascada de la relación.
 'CascadeType.ALL' significa que cualquier operación realizada en la entidad 'Profesor'
  (como persistir, eliminar o fusionar) debe conectarse en cascada a las entidades 'Materia'
   asociadas. Así, por ejemplo, si eliminas un 'Profesor', también se eliminarán todas las
   entidades 'Materia' asociadas.
 */
    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
    private List<Materia> materia;
}