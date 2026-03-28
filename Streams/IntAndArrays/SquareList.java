package Streams.IntAndArrays;

import java.util.Arrays;
import java.util.List;

public class SquareList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int total = nums.stream()
                .map(num-> num*num)
                .reduce(0,(x,y)->(x+y));
                System.out.println("Square sum "+total);

                total= nums.stream().mapToInt(num->num*num).sum();
                System.out.println(total);

        System.out.println("Square of Arrays");

        int[] numsArray = new int[] {1,2,3,4,5};
        double sum = Arrays.stream(numsArray)
                //.map(num-> num*num)
                .mapToDouble(num->Math.pow(num,2))
                //.mapToInt(doubleeval->(int)doubleeval)
                .sum();
                //.forEach(System.out::println);
        System.out.println(sum);
    }
}
