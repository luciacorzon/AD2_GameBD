package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear objetos Genero y Plataforma como ejemplos
        Genero genero = new Genero("Shooter");
        Plataforma plataforma = new Plataforma("Windows");

        // Crear imágenes para el juego
        Imagen imagen1 = new Imagen(15L,null, "https://example.com/imagen1.jpg", new byte[]{});
        Imagen imagen2 = new Imagen(16L, null, "https://example.com/imagen2.jpg", new byte[]{});

        // Crear el objeto Juego
        Juego juego = new Juego(
                1L,  // id del juego asignado manualmente
                "Call of Duty: Warzone",
                genero,
                plataforma,
                "Call of Duty: Warzone",
                "https://www.freetogame.com/g/452/thumbnail.jpg",
                "Live",
                "A standalone free-to-play battle royale",
                "Call of Duty: Warzone is both a standalone free-to-play battle royale and modes accessible via Modern Warfare.",
                "https://www.freetogame.com/open/call-of-duty-warzone",
                "Activision",
                "Infinity Ward",
                LocalDate.of(2020, 3, 10),
                Arrays.asList(imagen1, imagen2)
        );

        // Asociar imágenes al juego
        imagen1.setJuego(juego);
        imagen2.setJuego(juego);


       // /******* persistir ********/
        EntityManagerFactory emf = JuegosJPAManager.getEntityManagerFactory(JuegosJPAManager.NOMBRE_UNIDAD_DE_PERSISTENCIA);
        EntityManager em = emf.createEntityManager();

        try{
            em.getTransaction().begin();
            em.persist(genero);
            em.persist(plataforma);
            em.persist(juego);
            em.persist(imagen1);
            em.persist(imagen2);
            em.getTransaction().commit();
        }catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
    }
}