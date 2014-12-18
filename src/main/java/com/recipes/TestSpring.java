package com.recipes;

import com.recipes.service.RecipesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: vimal.sengoden
 * Created on: 12/17/14 1:03 AM
 */
public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");


        RecipesService service = (RecipesService) context.getBean("recipesService");

        service.saveRecipe();

        System.out.print("Done");
    }

}
