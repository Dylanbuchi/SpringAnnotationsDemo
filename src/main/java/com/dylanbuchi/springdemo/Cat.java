package com.dylanbuchi.springdemo;

import org.springframework.stereotype.Component;

/**
 * Cat
 */
@Component
public class Cat implements Animal {

    @Override
    public String favouriteFoodToEat() {
        // cat eats fish
        return "I'm a cat and I love to eat fish";
    }

    @Override
    public String chooseFood() {

        return "Fish";
    }

}