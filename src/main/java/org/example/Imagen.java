package org.example;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Access(AccessType.FIELD)
public class Imagen {
    @Id
    private Long idImagen;
    @OneToOne
    @JoinColumn(name = "idJuego")
    private Juego juego;
    private String url;
    private byte[] imagen;

    public Imagen() {
    }

    public Imagen(Long idImagen, Juego juego, String url, byte[] imagen) {
        this.idImagen = idImagen;
        this.juego = juego;
        this.url = url;
        this.imagen = imagen;
    }

    public Long getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Long idImagen) {
        this.idImagen = idImagen;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "idImagen=" + idImagen +
                ", juego=" + juego +
                ", url='" + url + '\'' +
                ", imagen=" + Arrays.toString(imagen) +
                '}';
    }
}
