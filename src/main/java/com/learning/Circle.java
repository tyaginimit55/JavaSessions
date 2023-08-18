package com.learning;

public class Circle {
    private int area;
    private String colorInstance;
    public Circle(String color) {
        this.colorInstance = color;
    }
    public String getColorInstance(){
        return colorInstance;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int overriddenSum(int a, int b){
        return a+b;
    }
}
