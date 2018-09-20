package com.jskno.testing.testingCode.chainResponsability.utils;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomValueGenerator {
    
    private Random random;
    
    public RandomValueGenerator() {
        this.random = new Random();
    }
    
    public boolean getRandomBoolean() {
        return this.random.nextBoolean();
    }
    
    

}
