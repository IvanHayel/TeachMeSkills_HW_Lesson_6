package com.teachmeskills.compulsory_tasks.task_2.model.employee;

import com.teachmeskills.compulsory_tasks.task_2.model.interfaces.Positionable;

public class Director implements Positionable {
    private String fullName;
    private double salary;

    public Director(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return "Director";
    }

    @Override
    public void printPosition() {
        System.out.println(fullName + " is a director.");
    }
}