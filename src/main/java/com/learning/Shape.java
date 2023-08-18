package com.learning;

public class Shape extends Circle {

    public Shape(String color) {
        super(color);
    }
    int zz= 123;

    public static void main(String[] args) {
        Circle circle = new Circle("Red");
        String result = circle.getColorInstance();
        System.out.println(result);

    }
    public static void main(String[] args, String s) {
        Circle circle = new Circle("Red");
        String result = circle.getColorInstance();
        System.out.println(result);

    }

    public int overriddenSum(int a, int b){
        return a+b+10;

    }

    //single inheritence class shape -> class circle
    //multilevel inheitence :- class a -> class b -> class c
    //hierarchical inheritence :- class shape -> class circle, class HierarchicalInheritance -> class circle
    // multiple :- class a -> class b, class c
    //hybrid inheritance :- B->A, C->A ; D->b,c




    //Access modifiers:-
    /*
    * private
    * public
    * protected
    * default
    * */
}
