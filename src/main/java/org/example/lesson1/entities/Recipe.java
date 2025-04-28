package org.example.lesson1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Recipe {
    private String recipeName;
    private String description;
    private int servings;
    private List<Ingredient> ingredients;
    private int prepTimeMinutes;
    private int cookTimeMinutes;
}
