package Streams;

import java.util.Arrays;
import java.util.List;

public class LenOfEachName {
    public static void main(String[] args) {
        List<String> lenOfEachWord = Arrays.asList("apple", "orange", "pineapple", "papaya", "berry", "strawberry", "kiwi", "berry", "kiwi");
        lenOfEachWord.stream()
                .map(str->str.length())
                .sorted()
                .forEach(System.out::println);
    }
}
