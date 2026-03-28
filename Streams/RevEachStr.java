package Streams;

/* reverse each word of a string*/
import java.util.Arrays;
import java.util.List;

public class RevEachStr {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple", "papaya", "berry", "strawberry", "kiwi", "berry", "kiwi","sky");
        firstEle.stream()
                .map(str->new StringBuffer(str).reverse())
                .forEach(System.out::println);
    }
}
