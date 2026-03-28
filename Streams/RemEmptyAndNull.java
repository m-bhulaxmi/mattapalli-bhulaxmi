package Streams;

import java.util.Arrays;
import java.util.List;

public class RemEmptyAndNull {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", " ", "orange", null, "pineapple", "","papaya", "berry", "strawberry", "kiwi", "berry", "kiwi","sky", "null");
        firstEle.stream()
                .filter(str->str!=null && (!str.trim().isEmpty()))
                .forEach(System.out::println);
    }
}
