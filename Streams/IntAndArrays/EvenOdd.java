package Streams.IntAndArrays;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,67,86,53,11,90,82,86,25,100);
        nums.stream()
                //.filter(num->num%2==0)
                .filter(num->num%2!=0)
                .forEach(System.out::println);


        System.out.println();
        int[] numsArray = new int[] {12,67,86,53,11,90,82,86,25,100};
        Arrays.stream(numsArray)
                .filter(num->num%2==0)
        .filter(num->num%2!=0)
                .forEach(System.out::println);

    }
}
