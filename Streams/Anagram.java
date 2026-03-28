package Streams;

import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        Map<Integer, Long> map1 = s1.chars()
                .boxed()
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        Map<Integer, Long> map2 = s2.chars()
                .boxed()
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        boolean isAnagram = map1.equals(map2);
        System.out.println(isAnagram);

    }
}
