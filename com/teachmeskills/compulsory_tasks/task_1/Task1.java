package com.teachmeskills.compulsory_tasks.task_1;

import com.teachmeskills.compulsory_tasks.task_1.model.figures.Circle;
import com.teachmeskills.compulsory_tasks.task_1.model.figures.Figure;
import com.teachmeskills.compulsory_tasks.task_1.model.figures.Rectangle;
import com.teachmeskills.compulsory_tasks.task_1.model.figures.Triangle;

/**
 * Write the "Figure" class hierarchy.
 * Figure -> Triangle -> Rectangle -> Circle.
 * Realize the function of calculating the area for each type of figure and calculating the perimeter.
 * Create an array of 5 figures.
 * Display the sum of the perimeter of all figures in an array.
 */

public class Task1 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(4.22, 10, 9);
        figures[1] = new Rectangle(4, 10.1);
        figures[2] = new Rectangle(2, 10);
        figures[3] = new Circle(1);
        figures[4] = new Circle(3.14);

        for (Figure figure : figures) {
            System.out.println("Figure: " + figure);
            System.out.println("Area: " + figure.getArea());
            System.out.println("Perimeter: " + figure.getPerimeter());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        System.out.print("Sum of perimeters = ");
        double perimeterSum = 0.0;
        for (Figure figure : figures) {
            perimeterSum += figure.getPerimeter();
        }
        System.out.println(perimeterSum);
    }
}