package com.dylanbuchi.springdemo;

import org.springframework.beans.factory.annotation.Value;

/**
 * Tiger
 */
public class Tiger implements Animal {
    private Food food;

    @Value("${foo.name}")
    private String name;

    @Value("${foo.age}")
    private String age;

    /**
     * @param food
     */
    public Tiger(Food food) {
        this.food = food;
    }

    @Override
    public String favouriteFoodToEat() {
        return "Juicy meat";
    }

    @Override
    public String chooseFood() {
        // TODO Auto-generated method stub
        return "200g of fresh meat";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

}