package Streams;

import java.util.Arrays;
import java.util.List;

public class ParticularWord {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
        word.stream()
                //.filter(str->str.contains("berriy"))
                .filter(str->str.contains("w"))
                .forEach(System.out::println);
    }
}
