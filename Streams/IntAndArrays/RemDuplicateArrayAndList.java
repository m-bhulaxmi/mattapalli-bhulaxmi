package Streams.IntAndArrays;

import java.util.Arrays;
import java.util.List;

public class RemDuplicateArrayAndList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,67,25,12,86,53,11,90,82,86,25,100);
        nums.stream()
                .distinct()
                .forEach(System.out::println);

        int[] numsArr = new int[] {12,67,25,12,86,53,11,90,82,86,25,100};
        Arrays.stream(numsArr).distinct().forEach(System.out::println);
    }
}
