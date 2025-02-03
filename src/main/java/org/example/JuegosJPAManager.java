package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.HashMap;
import java.util.Map;

public class JuegosJPAManager {
    public static final String NOMBRE_UNIDAD_DE_PERSISTENCIA = "JuegosPU";
    public static final Map<String, EntityManagerFactory> instancies = new HashMap<>();

    private JuegosJPAManager() {
    }

    private static boolean isEntityManagerFactoryClosed(String unidadPersistencia){
        return !instancies.containsKey(unidadPersistencia) || instancies.get(unidadPersistencia) == null
                || !instancies.get(unidadPersistencia).isOpen();
    }

    public static EntityManagerFactory getEntityManagerFactory(String unidadPersistencia){
        if (isEntityManagerFactoryClosed(unidadPersistencia)){
            if(isEntityManagerFactoryClosed(unidadPersistencia)){
                try{
                    instancies.put(unidadPersistencia, Persistence.createEntityManagerFactory(unidadPersistencia));
                }catch (Exception e){
                    System.err.println("Error al crear el EntityManagerFactory: " + e.getMessage());
                }
            }
        }
        return instancies.get(unidadPersistencia);
    }

    public static EntityManager getEntityManager(String unidadPersistencia){
        return getEntityManagerFactory(unidadPersistencia).createEntityManager();
    }

    public static void close(String unidadPersistencia){
        if (instancies.containsKey(unidadPersistencia)){
            instancies.get(unidadPersistencia).close();
            instancies.remove(unidadPersistencia);
        }
    }
}
