package com.sanjay.sample.spring.di.plain;


import com.sanjay.sample.spring.di.common.Circle;
import com.sanjay.sample.spring.di.common.Drawing;
import com.sanjay.sample.spring.di.common.Triangle;

public class Application {
    public static void main(String[] args) {
        Drawing d = new Drawing();
        d.setShape(new Circle());
        d.drawShape();
        d.setShape(new Triangle());
        d.drawShape();
    }
}
