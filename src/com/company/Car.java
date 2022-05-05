package com.company;

import java.util.Scanner;

public class Car {
    private String name;
    private String model;
    private String color;
    private int year;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void checkSpeed(int sp) {
        if (sp > 110) {
            System.out.println("too fost ");
        } else if (sp < 30) {
            System.out.println("too show! ");

        } else {
            System.out.println("You are good at drining! ");
        }


    }
}
