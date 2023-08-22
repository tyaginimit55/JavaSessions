package com.learning.shapesHierarchy;

public abstract class Shape  implements Drawable{

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*@Override
    public void draw(){
        System.out.println("drawing a " + getColor() + " " + this.getClass().getSimpleName());
    }*/
}
