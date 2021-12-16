package com.teachmeskills.compulsory_tasks.task_1.model.figures;

import java.util.Arrays;

public class Rectangle extends Figure {
    private double[] sides;

    public Rectangle(double length, double width) {
        sides = new double[2];
        if (isInputPositive(length, width)) {
            sides[0] = length;
            sides[1] = width;
        } else {
            sides[0] = 1.0;
            sides[1] = 2.0;
        }
    }

    private boolean isInputPositive(double... input) {
        for (double item : input) {
            if (item <= 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public double getPerimeter() {
        return 2 * (sides[0] + sides[1]);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "sides = " + Arrays.toString(sides) +
                '}';
    }
}