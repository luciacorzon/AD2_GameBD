package org.example;

import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlataforma;
    private String nombre;

    public Plataforma() {
    }

    public Plataforma(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(Long idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Plataforma{" + "idPlataforma=" + idPlataforma + ", nombre=" + nombre + '}';
    }
}
