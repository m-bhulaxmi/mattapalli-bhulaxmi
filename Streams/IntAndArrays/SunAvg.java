package Streams.IntAndArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SunAvg {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,67,86,53,11,90,82,86,25,100);
        int total = nums.stream()
                       // .mapToInt(num->num.intValue())
                              //  .sum();
                                      .mapToInt(Integer::valueOf).sum();
        System.out.println(total);

        System.out.println("Avg of numbers List");

        OptionalDouble optavg = nums.stream()
                .mapToDouble(num->num.doubleValue())
                .average();
        if(optavg.isPresent()) {
            System.out.println("Avg "+optavg.getAsDouble());
        }


        Optional<Integer> optNums = nums.stream().reduce((x, y)->x+y);
        optNums.ifPresent(System.out::println);



        System.out.println();

        int[] numArr = new int[] {12,67,86,53,11,90,82,86,25,100};
        total = Arrays.stream(numArr).sum();
        System.out.println(total);

        System.out.println("Array of numbers avg");
        optavg = Arrays.stream(numArr).average();
        optavg.ifPresent(System.out::println);
    }
}
