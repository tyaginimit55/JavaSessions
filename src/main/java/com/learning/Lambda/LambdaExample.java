package com.learning.Lambda;

public class LambdaExample {
    public static void main(String[] args) {
        int length = 10;
      /*
      //without lambda
      Drawable drawable = new Drawable() {
          @Override
          public void draw() {
              System.out.println("Drawing + " + length);
          }
      };*/

        //with lambda expression
        Drawable drawable = ()->{
            System.out.println("drawing with lambda " + length );
        };

      drawable.draw();
    }
}
