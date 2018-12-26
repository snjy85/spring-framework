package com.test.sample.spring.di.common;

import java.util.List;

public class Line implements Shape {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for (Point p : points) {
            System.out.println("In PointedTraingle with pointB " + p.getX() + " - " + p.getY());

        }
    }
}
