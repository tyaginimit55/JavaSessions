package com.learning.basicExamples;

import java.util.Scanner;

public class Main {
    public static int x=15;
        public static void main(String[] args) {

        System.out.println("Hello world!");

        int test = 10;
        Scanner scanner = new Scanner(System.in);
        int sub1 = scanner.nextInt();
        int sub2 = scanner.nextInt();
        int result = sum(sub1,sub2);

            System.out.println("-------------" +sum(10, 10, 20));
        System.out.println(result);

            System.out.println("-------------overloaded string " +sum("a", "b"));

        /*if(result>60){
            System.out.println("first div");
        }
        else if(result >50 && result <=60){
            System.out.println("Second");
        }
        else if (result >40 && result <=50) {
            System.out.println("third");
        }
        else {
            System.out.println("failed");
        }*/
        switch (result){
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case2");
                break;
            default:
                System.out.println("default");
        }
        /*int i;
        for(i=0;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println("number of iteration" + i);

        }*/
        /*int j=0;
        while (j<5){
            System.out.println("we're in while block " + j);
            j = j+2;
        }*/
        /*int j=0;
        do {
            System.out.println("do block ");
            j++;
        }while (j<5);*/
        System.out.println("enter array values");
       int x[] = new int[5];
       for (int i=0;i<5;i++){
           x[i] = scanner.nextInt();
       }
        System.out.println(x);
       int count = x.length;
       for (int i=0; i<=count ;i++){
           System.out.println("traverse with count " + x[i]);
       }
        /*for (int i=0;i<5;i++){
            System.out.println("native for loop for array traverse");
            System.out.println(x[i]);
        }
        for (int val: x) {
            System.out.println("for each " + val);
        }*/


    }
    public static int sum(int a, int b){
       return a +b;
    }
    //overloaded sum
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static String sum(String a, String b){
        return a+b;
    }
}