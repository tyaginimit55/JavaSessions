package com.learning.shapesHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radii of circle");
        int radius  = scanner.nextInt();

        Shape circle  = new Circle("Red", radius);

        circle.draw();
        System.out.println("Circle color " + circle.getColor());
        System.out.println("Calculated Circle area " + circle.calculateArea());

        Shape rectangle  = new Rectangle("Black", 4, 6);

        rectangle.draw();
        System.out.println("rectangle color " + rectangle.getColor());
        System.out.println("Calculated rectangle area " + rectangle.calculateArea());

    }
}
