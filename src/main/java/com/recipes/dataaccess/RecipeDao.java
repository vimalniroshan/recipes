package com.recipes.dataaccess;

import com.recipes.model.Recipe;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: vimal.sengoden
 * Created on: 12/17/14 12:24 AM
 */

@Repository
public class RecipeDao {

    private HibernateTemplate hibernateTemplate;

    @Autowired
    public void setSessionFactory(final SessionFactory sessionFactory) {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public void save(final Recipe recipe) {
        hibernateTemplate.save(recipe);
    }

    public List<Recipe> findAll() {
        return hibernateTemplate.loadAll(Recipe.class);
    }
}
