package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class FindFirstEleLenGreaterThanTen {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple","papaya", "berry", "strawberryy", "kiwi", "berry", "kiwi","sky");
        String val = firstEle.stream()
                .filter(str->str.length()>10)
                .findAny()
                .orElseThrow(()->new NoSuchElementException("No value"));
        System.out.println(val);
    }
}
