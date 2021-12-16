package com.teachmeskills.compulsory_tasks.task_2;

import com.teachmeskills.compulsory_tasks.task_2.model.employee.Accountant;
import com.teachmeskills.compulsory_tasks.task_2.model.employee.Director;
import com.teachmeskills.compulsory_tasks.task_2.model.employee.Worker;
import com.teachmeskills.compulsory_tasks.task_2.model.interfaces.Positionable;

/**
 * Create classes "Director", "Worker", "Accountant".
 * Implement an interface with a method that prints the job title and implement this method in the generated classes.
 */

public class Task2 {
    public static void main(String[] args) {
        Director director = new Director("Steve Jobs", 1);
        Positionable worker = new Worker("Donda West", 340);
        Accountant accountant = new Accountant("Arthur Young", 500);

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}