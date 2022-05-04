package com.company;

import java.util.Scanner;

public class Triangle {
    double a;
    double b;
    double c;


   static void area(double a, double b, double c) {
        double p = ((a + b + c) / 2);
        double i = p * (p - a) * (p - b) * (p - c);
        double s = Math.sqrt(i);
        System.out.println(s);

    }
}
