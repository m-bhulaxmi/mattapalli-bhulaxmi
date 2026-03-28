package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroElementsToRightInList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,0,-3,0,5,-2,0,8,0,-4);
        List<Integer> moveZeroToRight = Stream.concat(num.stream().filter(n->n!=0), num.stream().filter(n-> n==0))
                .collect(Collectors.toList());

        //moveZeroToRight.forEach(System.out::println);
        System.out.println(moveZeroToRight);


    }
}
