package com.teachmeskills.compulsory_tasks.task_2.model.employee;

import com.teachmeskills.compulsory_tasks.task_2.model.interfaces.Positionable;

public class Accountant implements Positionable {
    private String fullName;
    private double salary;

    public Accountant(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return "Accountant";
    }

    @Override
    public void printPosition() {
        System.out.println(fullName + " is an accountant.");
    }
}