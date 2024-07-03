package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(new Product("Milk", 2.25, 100),
                new Product("Honey", 8.50, 50),
                new Product("Oranges", 3.15, 200),
                new Product("Apples", 5.90, 20)));

        System.out.println("Ascending Sorting");
        Collections.sort(products);     // Comparable was used
        products.forEach(System.out::println);

        System.out.println("Descending Sorting");
        Collections.reverse(products);
        products.forEach(System.out::println);
    }
}
