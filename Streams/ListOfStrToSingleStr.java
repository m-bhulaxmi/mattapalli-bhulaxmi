package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStrToSingleStr {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple", "papaya", "berry", "strawberry", "kiwi", "berry", "kiwi","sky");
        String val = firstEle.stream()
                .collect(Collectors.joining(","));
        System.out.println(val);
    }
}
