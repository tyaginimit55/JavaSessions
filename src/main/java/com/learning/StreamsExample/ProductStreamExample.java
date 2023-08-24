package com.learning.StreamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductStreamExample {
    public static void main(String[] args) {
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

        /*Optional<Product> p = productArrayList.stream().findAny().filter(product -> product.price == 10000);
        System.out.println(p);
        System.out.println(p.get().getName());*/
    }
}
