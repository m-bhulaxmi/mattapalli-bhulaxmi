package Streams;

import java.util.Arrays;
import java.util.List;

public class ProductOfNum {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        num.stream()
                .map(n->n*n)
                .forEach(System.out::println);
        /*product the list of numbers
         */
        int product = num.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(product);
    }
}
