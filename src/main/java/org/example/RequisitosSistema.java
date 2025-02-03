package org.example;


public class RequisitosSistema {
    private Long idJuego;
    private String sistemaOperativo;
    private String almacenamiento;
    private String graficos;
    private String memoria;
    private String procesador;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "idJuego")
    private Juego juego;
}
