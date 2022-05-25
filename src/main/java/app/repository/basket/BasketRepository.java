package app.repository.basket;

import app.product.model.Product;
import app.utils.EntityManagerFactoryUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BasketRepository {
    public static  void create(Product product){
        //create a manager to do all the CRUD operations with student object
        //i can create manager cause I created EntityManagerFactoryUtils
        EntityManager manager = EntityManagerFactoryUtils.getEntityManger();
        //manager call Transaction, that is, it is a state to persist
        EntityTransaction transaction = manager.getTransaction();
        //let s start with begin the operations, thanks to transaction object
        transaction.begin();
        //prepares the operation to be done
        manager.persist(product);
        //this operation WRITES the object on the actual table
        transaction.commit();
        manager.close();
    }
}
