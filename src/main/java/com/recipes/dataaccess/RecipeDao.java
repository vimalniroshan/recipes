package com.recipes.dataaccess;

import com.recipes.model.Recipe;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * @author: vimal.sengoden
 * Created on: 12/17/14 12:24 AM
 */

@Repository
public class RecipeDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(final SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(final Recipe recipe) {
        sessionFactory.openSession().save(recipe);
    }
}
