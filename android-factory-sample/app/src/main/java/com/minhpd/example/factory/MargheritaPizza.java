package com.minhpd.example.factory;

import com.minhpd.example.factory.annotations.Factory;

/**
 * @author Hannes Dorfmann
 */

@Factory(
        id = "Margherita",
        type = Meal.class
)
public class MargheritaPizza implements Meal {

    @Override public float getPrice() {
        return 6f;
    }
}
