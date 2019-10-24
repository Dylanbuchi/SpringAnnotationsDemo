package com.dylanbuchi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main App to test spring annotations
 */
public class SpringAnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from container
        Animal dog = context.getBean("dog", Animal.class);

        // call a method
        System.out.println("\n" + dog.favouriteFoodToEat());

        System.out.println("\n" + dog.chooseFood() + "\n");

        // close the bean
        context.close();

    }
}