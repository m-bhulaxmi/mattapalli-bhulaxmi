package Streams.IntAndArrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AscDescSort {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,67,86,53,11,90,82,86,25,100);
        nums.stream()
                //.sorted()
                //.forEach(System.out::println);
                //.sorted((a,b)->b-a)
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                        .forEach(System.out::println);


        System.out.println();

        int[] numArr = new int[] {12,67,86,53,11,90,82,86,25,100};
        Arrays.stream(numArr)
//                .sorted()
//                .forEach(System.out::println);
                //.boxed()
                //.mapToObj(num->Integer.valueOf(num))
                .mapToObj(Integer::valueOf)
                .sorted((a,b)->b-a)
                .forEach(System.out::println);
        System.out.println();

        Arrays.stream(numArr)
                .mapToObj(Integer::valueOf)
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .forEach(System.out::println);

    }
}
