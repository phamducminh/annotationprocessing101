package com.minhpd.example.factory;

import com.minhpd.example.factory.annotations.Factory;

/**
 * @author Hannes Dorfmann
 */

@Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {

    @Override public float getPrice() {
        return 4.5f;
    }
}
