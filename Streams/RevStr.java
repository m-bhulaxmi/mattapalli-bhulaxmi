package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RevStr {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple","papaya", "berry", "strawberry", "kiwi", "berry", "kiwi","sky");
        IntStream.range(0, firstEle.size())
                .mapToObj(i->firstEle.get(firstEle.size()-1-i))
                .forEach(System.out::println);
    }
}
