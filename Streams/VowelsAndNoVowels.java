package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VowelsAndNoVowels {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple","papaya", "berry", "strawberry", "kiwi", "berry", "kiwi","sky");
        //Predicate<String> pred = str->str.matches(".")
        Map<Boolean,List<String>> mapWords= firstEle.stream()
                .collect(Collectors.partitioningBy(str->str.matches(".*[aeiou].*")));
        mapWords.forEach((key,val)-> {System.out.println(key+ "\t" +val);
        });

    }
}
