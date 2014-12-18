package com.recipes;

import com.recipes.model.Recipe;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author: vimal.sengoden
 * Created on: 12/16/14 11:21 PM
 */
public class Test {

    private static SessionFactory factory;

    public static void main(String[] args) {
        try{
            factory = new Configuration().
                    configure().
                    addAnnotatedClass(Recipe.class).
                    buildSessionFactory();
        }catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(new Recipe("test3", "test description3"));
            tx.commit();
        }
        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

}
