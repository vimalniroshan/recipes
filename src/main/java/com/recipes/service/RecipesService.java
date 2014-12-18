package com.recipes.service;

import com.recipes.dataaccess.RecipeDao;
import com.recipes.model.Recipe;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: vimal.sengoden
 * Created on: 12/17/14 12:24 AM
 */

@Service
@Transactional
public class RecipesService {
    private RecipeDao recipeDao;

    public void setRecipeDao(final RecipeDao recipeDao) {
        this.recipeDao = recipeDao;
    }


    public void saveRecipe() {
        recipeDao.save(new Recipe("name-serivce", "description-service"));
    }
}
