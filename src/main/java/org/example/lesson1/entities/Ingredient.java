package org.example.lesson1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ingredient {
    private String item;
    private int quantity;
    private String unit;
}
