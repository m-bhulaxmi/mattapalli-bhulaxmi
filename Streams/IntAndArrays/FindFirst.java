package Streams.IntAndArrays;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,67,86,53,11,90,82,86,25,100);
        int first = nums.stream()
                .filter(num->num>50)
                .findFirst()
                .get();
        System.out.println("first number "+first);

        int[] numsArr = new int[] {12,67,86,53,11,90,82,86,25,100};
        first = Arrays.stream(numsArr).filter(num->num>50)
                .findFirst()
                .getAsInt();
        System.out.println("Array First Number "+first);
    }
}
