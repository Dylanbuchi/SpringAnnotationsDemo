package com.dylanbuchi.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Snake
 */
@Configuration
@ComponentScan("com.dylanbuchi.springdemo")
@PropertySource("application.properties")
public class Snake {

    @Bean
    public SpecialFood specialFood() {
        return new SpecialFood();

    }

    @Bean
    public Animal tiger() {
        return new Tiger(specialFood());

    }

}
