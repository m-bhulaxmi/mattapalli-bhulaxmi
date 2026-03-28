package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LonestStr {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple", "papaya", "berry", "strawberry", "kiwi", "berry", "kiwi");
        Optional<String> optStr = firstEle.stream()
                .max(Comparator.comparing(String::length));
                optStr.ifPresent(str->System.out.println(str.toUpperCase()));
    }
}
