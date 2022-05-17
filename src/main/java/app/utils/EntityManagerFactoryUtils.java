package app.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtils {
    public static EntityManagerFactory entityManagerFactory = createEntityManagerFactory();

    private static EntityManagerFactory createEntityManagerFactory(){
        //creates with persistence a entity manager factory with UNIT PERSISTENCE "baketBBDD-repository"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("baketBBDD-repository");
        return entityManagerFactory;

    }

    public static EntityManager getEntityManger(){
        //with entity manager factory creates a ENTITY MANAGER
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;

    }
}
