package com.dylanbuchi.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Dog
 */

@Component
public class Dog implements Animal {

    @Autowired
    @Qualifier("randomFood")
    private Food food;

    public Dog() {
        System.out.println("inside constructor");

    }

    @Override
    public String favouriteFoodToEat() {

        return "I'm a dog and I love to eat meat";
    }

    @Override
    public String chooseFood() {

        return food.getFood();
    }

    /**
     * @param food the food to set public void setFood(Food food) {
     *             System.out.println("inside setter method"); this.food = food; }
     */

    /**
     * constructor
     * 
     * @Autowired public Dog(Food food) { this.food = food; }
     * @param food
     */
    @PostConstruct
    public void Start() {
        System.out.println("\nHello\n");

    }

    // custom method to do just before the bean is destroyed
    @PreDestroy
    public void destroyed() {
        System.out.println("\nThe bean will be destroyed now\n");

    }
}