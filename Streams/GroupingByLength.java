package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLength {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple","papaya", "berry", "strawberry", "kiwi", "berry", "kiwi","sky");
        Map<Integer,List<String>> mapWords = firstEle.stream()
                .collect(Collectors.groupingBy(String::length));
        mapWords.forEach((key,val) -> {System.out.println(key+ "\t" +val);
        });
    }
}
