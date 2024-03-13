package com.example.AppServicios.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Imagen {
 
     @Id
    private Long id;
    
}
