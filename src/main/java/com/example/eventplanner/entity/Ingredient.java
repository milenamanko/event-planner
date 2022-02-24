package com.example.eventplanner.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private BigDecimal price;

    private Integer packagingQuantity;

    private QuantityUnit unit;

    @OneToMany
    private List<IngredientEntry> dishes;
}
