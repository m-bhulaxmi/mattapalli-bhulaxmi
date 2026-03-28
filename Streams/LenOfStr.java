package Streams;

import java.util.Arrays;
import java.util.List;

public class LenOfStr {
    public static void main(String[] args) {
        List<String> lenOfStr = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
            long count = lenOfStr.stream()
                    .filter(str->str.length()>5)
                    .count();
                    System.out.println(count);
    }
}