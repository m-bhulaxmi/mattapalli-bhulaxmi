package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* Given a list of strings, sort them according to increasing order of their length?*/
public class SortStrByLen {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple", "papaya", "berry", "strawberry", "kiwi", "berry", "kiwi");
        firstEle.stream()
                //.sorted((o1,o2)->((Integer)o2.length()).compareTo(o1.length()))
                //.sorted(Comparator.comparing(str->str.length()))
                .sorted(Comparator.comparing(String::length))
                //.sorted(Comparator.comparing(String::length).reversed())
                //.skip(2)
                .forEach(System.out::println);
                //.findFirst().ifPresent(System.out::println);
    }
}
