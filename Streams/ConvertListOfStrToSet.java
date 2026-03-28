package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListOfStrToSet {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "kiwi", "orange", "banana");
        Set<String> set = new HashSet<>(words);
        System.out.println(set);
    }
}
