package Streams;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> remDup = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
        remDup.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
