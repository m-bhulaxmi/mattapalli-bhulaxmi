package Streams;

import java.util.Arrays;
import java.util.List;

public class StrOfVowels {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple", "papaya", "berry", "strawberry", "kiwi", "berry", "kiwi","sky");
        long count1 = firstEle.stream()
                .filter(str->str.matches(".*[aeiouAEIOU].*"))
                .count();
        System.out.println(count1);
    }
}
