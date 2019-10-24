package com.dylanbuchi.springdemo;

import org.springframework.stereotype.Component;

/**
 * FishFood
 */
@Component("fish")
public class FishFood implements Food {

    @Override
    public String getFood() {
        // TODO Auto-generated method stub
        return "Fish";
    }

}