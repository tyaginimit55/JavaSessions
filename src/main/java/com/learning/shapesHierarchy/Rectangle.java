package com.learning.shapesHierarchy;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public void draw() {
        System.out.println("drawing a "+ this.getColor() + " " + this.getClass().getSimpleName());
    }
}
