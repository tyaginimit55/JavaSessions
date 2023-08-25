package com.learning.StreamsExample;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProductStreamExample {
    public static void main(String[] args) throws IOException {
        ArrayList<Product>  productArrayList = new ArrayList<>();

        productArrayList.add(new Product(1, "Windows laptop", 5000));
        productArrayList.add(new Product(1, "Mac laptop", 10000));
        productArrayList.add(new Product(1, "Hp laptop", 8000));
        productArrayList.add(new Product(1, "Microsoft surface", 12000));

        List<Integer> priceList = productArrayList.stream().filter(product -> product.price>=8000)
                .map(product -> product.price)
                .collect(Collectors.toList());

        System.out.println(priceList);

        boolean result = productArrayList.stream().anyMatch(product -> product.price==8000);
        System.out.println(result);
        /*try {
            Optional<Product> p = productArrayList.stream().findAny().filter(product -> product.price == 10000);
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException ex){
                System.out.println("arithmatic Exception " + ex.getMessage());
            }
            System.out.println(p);
            System.out.println(p.get().getName());
        } catch (NoSuchElementException e){
            System.out.println("NSE exception occured" + e.getMessage());
        }*/

        /*try {
            Optional<Product> p = productArrayList.stream().filter(product -> product.price == 10000).findAny();
            /// db queries here



            // cleanup- closing connection
        } catch (NoSuchElementException nse) {
            System.out.println(nse.getMessage());
        } finally {
            System.out.println("finally executed, performing cleanup");
        }*/

        try{
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x == 0){
                throw new ArithmeticException("error  message - Incorrect input");
            }
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }
        try {
            exception();
        }catch (IOException e) {
            System.out.println("ertyuioxcvbnm" + e.getMessage());
        }
    }

    public static void exception() throws IOException{
        throw new IOException("sample throw io ex");
    }
}
