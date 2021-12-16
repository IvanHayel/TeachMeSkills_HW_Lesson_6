package com.teachmeskills.compulsory_tasks.task_1.model.figures;

import java.util.Arrays;

import static java.lang.Math.sqrt;

/**
 * Heron's formula was used to calculate the area in this class.
 */

public class Triangle extends Figure {
    private double[] sides;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        sides = new double[3];
        if (isInputPositive(firstSide, secondSide, thirdSide)) {
            sides[0] = firstSide;
            sides[1] = secondSide;
            sides[2] = thirdSide;
        } else {
            sides[0] = 3.0;
            sides[1] = 4.0;
            sides[2] = 5.0;
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
        if (isSidesCorrect()) {
            double halfPerimeter = getPerimeter() / 2.0;
            double area = sqrt(
                    halfPerimeter * (halfPerimeter - sides[0]) * (halfPerimeter - sides[1]) * (halfPerimeter - sides[2])
            );
            return area;
        }
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        if (isSidesCorrect()) {
            double perimeter = 0;
            for (double side : sides) {
                perimeter += side;
            }
            return perimeter;
        }
        return 0.0;
    }

    private boolean isSidesCorrect() {
        for (int current = 0; current < 3; current++) {
            int sum = 0;
            for (int counter = 0; counter < 3; counter++) {
                if (counter != current) {
                    sum += sides[counter];
                }
            }
            if (sides[current] > sum) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "sides = " + Arrays.toString(sides) +
                '}';
    }
}