package com.dylanbuchi.springdemo;

import org.springframework.stereotype.Component;

/**
 * Rice
 */
@Component
public class Rice implements Food {

    @Override
    public String getFood() {

        return "Rice";
    }

}