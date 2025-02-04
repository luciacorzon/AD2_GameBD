package org.example;


import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class RequisitosSistema {
    @Id
    private Long idJuego;
    @Column(name = "sos")
    private String sistemaOperativo;
    private String almacenamiento;
    private String graficos;
    private String memoria;
    private String procesador;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "idJuego")
    private Juego juego;

    public RequisitosSistema() {
    }

    public RequisitosSistema(String sistemaOperativo, String almacenamiento, String graficos, String memoria, String procesador, Juego juego) {
        this.sistemaOperativo = sistemaOperativo;
        this.almacenamiento = almacenamiento;
        this.graficos = graficos;
        this.memoria = memoria;
        this.procesador = procesador;
        this.juego = juego;
    }

    public Long getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Long idJuego) {
        this.idJuego = idJuego;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getGraficos() {
        return graficos;
    }

    public void setGraficos(String graficos) {
        this.graficos = graficos;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    @Override
    public String toString() {
        return "RequisitosSistema{" + "idJuego=" + idJuego + ", sistemaOperativo=" + sistemaOperativo + ", almacenamiento=" + almacenamiento + ", graficos=" + graficos + ", memoria=" + memoria + ", procesador=" + procesador + ", juego=" + juego + '}';
    }
}
