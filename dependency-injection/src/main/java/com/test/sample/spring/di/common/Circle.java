package com.test.sample.spring.di.common;

public class Circle implements Shape {

    private int radius = 5;

    public void draw() {
        System.out.println("In Cricle draw method with radius :" + getRadius());
    }

    public int getRadius() {
        return radius;
    }

    // Setter Injection
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
