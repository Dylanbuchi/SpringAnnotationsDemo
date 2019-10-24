package com.dylanbuchi.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * RandomFood
 */
@Component
public class RandomFood implements Food {

    private String[] food;

    // method to return a random food
    public String randomFood() {
        food = new String[3];

        Random randomN = new Random();
        int n = randomN.nextInt(3);

        food[0] = "Meat Balls";
        food[1] = "Fish";
        food[2] = "Rice";

        return food[n];

    }

    @Override
    public String getFood() {

        return randomFood();
    }

}