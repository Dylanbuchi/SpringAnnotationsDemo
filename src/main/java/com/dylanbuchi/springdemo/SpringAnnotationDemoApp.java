package com.dylanbuchi.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main App to test spring annotations
 */
public class SpringAnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Snake.class);

        // retrieve bean from container
        Tiger tiger = context.getBean("tiger", Tiger.class);
        System.out.println(tiger.chooseFood());
        System.out.println(tiger.favouriteFoodToEat());

        // getting values from the application properties file
        System.out.println(tiger.getAge());
        System.out.println(tiger.getName());
        // close the bean
        context.close();

    }
}