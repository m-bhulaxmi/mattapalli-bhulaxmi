package Streams;
import java.util.Arrays;
import java.util.List;

public class ToUpperAndSort {
    public static void main(String[] args) {
        List<String> toUpper = Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
            toUpper.stream()
//                    .map(str->str.toUpperCase())
//                    .sorted()
//                    .forEach(str->System.out.println(str));
                    .map(String::toUpperCase)
                    .sorted()
                    .forEach(System.out::println);
    }
}
