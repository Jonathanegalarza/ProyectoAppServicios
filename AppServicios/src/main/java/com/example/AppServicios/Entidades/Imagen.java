package com.example.AppServicios.Entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mime;
    private String nombre;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] contenido;
}
