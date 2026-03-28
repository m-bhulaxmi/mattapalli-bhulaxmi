package Streams;

import java.util.Arrays;
import java.util.List;

public class PrintStrEleExcludeDigits {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "123", "pineapple","567", "berry", "strawberry", "045", "berry", "kiwi","678");
        firstEle.stream()
                .filter(str->!str.matches(".*[0-9].*"))
                .forEach(System.out::println);
    }
}
