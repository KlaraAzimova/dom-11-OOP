package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please write your number :");
        triangle.a = scan.nextInt();
        System.out.print("Please write your number :");
        triangle.b = scan.nextInt();
        System.out.print("Please write your number :");
        triangle.c = scan.nextInt();
        System.out.print("Area of Triangle is: ");
        Triangle.area(triangle.a, triangle.b, triangle.c);
//        System.out.println("Area of Triangle is: " + area)
    }
}