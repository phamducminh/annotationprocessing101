package com.minhpd.example.factory;

/**
 * @author Hannes Dorfmann
 */
public class PizzaStore {

    private final MealFactory factory = new MealFactory();

    public Meal order(String mealName) {
        return factory.create(mealName);
    }
}
