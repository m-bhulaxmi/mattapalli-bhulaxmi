package Streams.IntAndArrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,67,86,53,11,90,82,86,25,100);
        int max = nums.stream()
                .max(Comparator.comparing(Integer::valueOf)).get();
                        //.mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max);
        int min = nums.stream()
                .min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);




        int[] numArr = new int[] {12,67,86,53,11,90,82,86,25,100};
        OptionalInt optNum = Arrays.stream(numArr).max();
        optNum.ifPresent(maxx->System.out.println(maxx));
    }
}
