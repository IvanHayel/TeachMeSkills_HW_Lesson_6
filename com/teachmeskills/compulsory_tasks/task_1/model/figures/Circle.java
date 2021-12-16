package com.teachmeskills.compulsory_tasks.task_1.model.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius = " + radius +
                '}';
    }
}