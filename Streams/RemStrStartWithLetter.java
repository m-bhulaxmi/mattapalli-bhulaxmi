package Streams;

import java.util.Arrays;
import java.util.List;

public class RemStrStartWithLetter {
    public static void main(String[] args) {
        List<String> remWord = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
        remWord.stream()
                .filter(str->!str.startsWith("p"))
                .forEach(System.out::println);
    }
}
