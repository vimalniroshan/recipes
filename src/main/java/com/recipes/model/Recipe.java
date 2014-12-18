package com.recipes.model;


import javax.persistence.*;

/**
 * @author: vimal.sengoden
 * Created on: 12/17/14 12:01 AM
 */

@Entity
@Table(name = "RECIPE")
public class Recipe {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public Recipe() {
    }

    public Recipe(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}
