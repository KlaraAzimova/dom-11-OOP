package com.company;

public class Triangle {
    double a;
    double b;
    double c;

    void area() {
        double p = (a + b + c) / 2;
        double i = p * (p - a) * (p - b) * (p - c);
        double s = Math.sqrt(i);
        System.out.println(s);


    }

}
