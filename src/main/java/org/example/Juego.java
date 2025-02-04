package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
public class Juego {
    @Id
    private Long idJuego;
    @Column(name = "titulo")
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "idGenero")
    private Genero genero;
    @ManyToOne
    @JoinColumn(name = "idPlataforma")
    private Plataforma plataforma;
    private String titulo;
    private String miniatura;
    private String estado;
    private String descripcionCorta;
    private String descripcion;
    private String url;
    private String editor;
    private String desarrollador;
    private LocalDate fecha;
    @OneToMany
    private List<Imagen> imagenes;

    public Juego() {
    }

    public Juego(Long idJuego, String nombre, Genero genero, Plataforma plataforma, String titulo, String miniatura, String estado, String descripcionCorta, String descripcion, String url, String editor, String desarrollador, LocalDate fecha, List<Imagen> imagenes) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.genero = genero;
        this.plataforma = plataforma;
        this.titulo = titulo;
        this.miniatura = miniatura;
        this.estado = estado;
        this.descripcionCorta = descripcionCorta;
        this.descripcion = descripcion;
        this.url = url;
        this.editor = editor;
        this.desarrollador = desarrollador;
        this.fecha = fecha;
        this.imagenes = imagenes;
    }

    public Long getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Long idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(String miniatura) {
        this.miniatura = miniatura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "idJuego=" + idJuego +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", plataforma=" + plataforma +
                ", titulo='" + titulo + '\'' +
                ", miniatura='" + miniatura + '\'' +
                ", estado='" + estado + '\'' +
                ", descripcionCorta='" + descripcionCorta + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", url='" + url + '\'' +
                ", editor='" + editor + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", fecha=" + fecha +
                ", imagenes=" + imagenes +
                '}';
    }
}
