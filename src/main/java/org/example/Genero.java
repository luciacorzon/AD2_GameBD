package org.example;

import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;
    private String nombre;

    public Genero() {
    }

    public Genero(String nome) {
        this.nombre = nome;
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Genero{" + "idGenero=" + idGenero + ", nome=" + nombre + '}';
    }
}
