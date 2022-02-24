package com.example.eventplanner.entity;

import com.example.eventplanner.entity.Recipe.Dish;
import com.example.eventplanner.entity.Recipe.Drink;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private LocalDateTime dateTime;

    @ManyToMany
    private List<Guest> guestList;

    @ManyToMany
    private List<Dish> dishes;

    @ManyToMany
    private List<Drink> drinks;
}
