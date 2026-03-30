package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> remDup = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
        List<String> dup = remDup.stream()
                .distinct()
                        .collect(Collectors.toList());
        System.out.println("With distinct():" +dup);
        /* remove duplicates without distinct*/
        Set<String> duplicate = new HashSet<>();
        List<String> dup1 = remDup.stream()
                .filter(n-> duplicate.add(n))
                .collect(Collectors.toList());
        System.out.println("Without Distinct():" + dup1);

        /* remove duplicates with method reference*/
        Set<String> duplicate1 = new HashSet<>();
        List<String> dup2 = remDup.stream()
                .filter(duplicate1::add)
                .collect(Collectors.toList());
        System.out.println("With method reference:" +dup2);


    }
}
