package Streams.IntAndArrays;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(12,67,86,53,11,90,82,86,25,100);
       int secondLargest = num.stream()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second Largest element from the list "+secondLargest);

        int[] numsArr = new int[] {12,67,86,53,11,90,82,86,25,100};
        int secondSmallest = Arrays.stream(numsArr)
                .mapToObj(Integer::valueOf)
                //.sorted((a,b)->b-a)
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second largest element from the Array "+secondSmallest);
    }
}
