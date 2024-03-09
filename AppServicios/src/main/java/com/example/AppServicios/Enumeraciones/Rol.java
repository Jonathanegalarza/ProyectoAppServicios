
package com.example.AppServicios.Enumeraciones;

public enum Rol {
    
    ADMIN("Administrador"),
    PROFESOR("Profesor"),
    CLIENTE("Cliente");

    private final String descripcion;

    Rol(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

