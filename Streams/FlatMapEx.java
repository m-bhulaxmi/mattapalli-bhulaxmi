package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] args) {
        List<Integer> evenNum = Arrays.asList(2,4,6,8,10);
        List<Integer> oddNum = Arrays.asList(1,3,5,7,9);
        List<List<Integer>> list = Arrays.asList(evenNum, oddNum);
        list.stream().flatMap(li->li.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
