package com.test.sample.spring.di.plain;


import com.test.sample.spring.di.common.Circle;
import com.test.sample.spring.di.common.Drawing;
import com.test.sample.spring.di.common.Triangle;

public class ApplicationPlain {
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("ApplicationPlain Example");
        System.out.println("**************************************");
        Drawing d = new Drawing();
        d.setShape(new Circle());
        d.drawShape();
        d.setShape(new Triangle());
        d.drawShape();
    }
}
