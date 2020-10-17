package com.minhpd.example.factory;

import com.minhpd.example.factory.annotations.Factory;

/**
 * @author Hannes Dorfmann
 */
@Factory(
        id = "Calzone",
        type = Meal.class
)
public class CalzonePizza implements Meal {

    @Override public float getPrice() {
        return 8.5f;
    }
}
