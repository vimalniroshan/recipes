package com.recipes.service;

import com.recipes.dataaccess.RecipeDao;
import com.recipes.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * @author: vimal.sengoden
 * Created on: 12/17/14 12:24 AM
 */

@Path("services")
@Service
@Transactional
public class RecipesService {

    @Autowired
    private RecipeDao recipeDao;

    public void setRecipeDao(final RecipeDao recipeDao) {
        this.recipeDao = recipeDao;
    }

    @GET
    @Path("/getAllRecipes")
    @Produces("application/json")
    public List<Recipe> getAllRecipes() {
        return recipeDao.findAll();
    }

    @GET
    @Path("/addRecipe")
    @Consumes("application/json")
    @Produces("application/json")
    public String addRecipe(Recipe recipe) {
        recipeDao.save(recipe);
        return "added recipe with name : " + recipe.getName();
    }
}
