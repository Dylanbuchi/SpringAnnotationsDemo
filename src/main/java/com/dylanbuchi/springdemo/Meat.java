package com.dylanbuchi.springdemo;

import org.springframework.stereotype.Component;

/**
 * Meat
 */
@Component
public class Meat implements Food {
    @Override

    public String getFood() {

        return "Meat Balls";
    }

}