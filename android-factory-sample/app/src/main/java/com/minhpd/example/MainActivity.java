package com.minhpd.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.minhpd.example.factory.Meal;
import com.minhpd.example.factory.PizzaStore;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PizzaStore pizzaStore = new PizzaStore();
        Meal meal = pizzaStore.order("Tiramisu");
        Timber.d("Bill: $%s", meal.getPrice());
    }
}