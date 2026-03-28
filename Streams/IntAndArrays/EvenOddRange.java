package Streams.IntAndArrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class EvenOddRange {
    public static void main(String[] args) {
        IntStream.rangeClosed(10,100)
                .filter(num->num%2==0)
                .forEach(System.out::println);


        System.out.println();

        IntStream.rangeClosed(10,100)
                .filter(num->num%2!=0)
                .forEach(System.out::println);
    }
}
