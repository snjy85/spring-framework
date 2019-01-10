package com.test.sample.spring.di.common;

import org.springframework.context.ApplicationContext;

public class PointedTriangle implements Shape {

    private ApplicationContext context;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("In PointedTraingle with pointA " + pointA.getX() + " - " + pointA.getY());
        System.out.println("In PointedTraingle with pointB " + pointB.getX() + " - " + pointB.getY());
        System.out.println("In PointedTraingle with pointC " + pointC.getX() + " - " + pointC.getY());
    }

}
