package com.learning.shapesHierarchy;

public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color); // creating obj of Shape;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public void draw() {
        System.out.println("drawing a "+ this.getColor() + " " + this.getClass().getSimpleName());
    }
}
