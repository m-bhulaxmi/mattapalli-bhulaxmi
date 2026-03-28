package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByVowels {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple","papaya", "berry", "strawberry", "kiwi", "berry", "kiwi","sky");
        Map<Boolean,List<String>> mapWords = firstEle.stream()
                //.filter(str->str.matches(".*[aeiou].*"))
                .collect(Collectors.partitioningBy(str->str.matches(".*[aeiou].*")));
        System.out.println(mapWords.get(true));
        System.out.println(mapWords.get(false));

    }
}
