package com.example.eventplanner.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class IngredientEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Long recipeId;

    @ManyToOne
    private Long ingredientId;

    private Integer quantity;

    private QuantityUnit unit;
}
