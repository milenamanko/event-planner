package com.example.eventplanner.entity.Recipe;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Dish extends Recipe {

    private DifficultyLevel difficultyLevel;

    private DishType dishType;
}
