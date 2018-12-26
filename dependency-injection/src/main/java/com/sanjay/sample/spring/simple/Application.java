package com.sanjay.sample.spring.simple;


public class Application {
    public static void main(String[] args) {
        Drawing d = new Drawing();
        d.setShape(new Circle());
        d.drawShape();
        d.setShape(new Triangle());
        d.drawShape();
    }
}
