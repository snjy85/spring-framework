package com.test.sample.spring.di.common;

public class Drawing {

    // Dependency Injection
    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}
