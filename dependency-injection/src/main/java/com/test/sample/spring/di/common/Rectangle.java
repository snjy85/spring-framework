package com.test.sample.spring.di.common;

public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void draw() {
        System.out.println("In Rectangle draw method with height :" + getHeight());
        System.out.println("In Rectangle draw method with width :" + getWidth());
    }

    public int getWidth() {
        return width;
    }

}