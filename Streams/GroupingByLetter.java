package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLetter {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple","papaya", "berry", "strawberry", "kiwi", "berry", "kiwi","sky");
        Map<Character,List<String>>mapWords = firstEle.stream()
                //.collect(Collectors.groupingBy(str->str.charAt(0));
                .collect(Collectors.groupingBy(str->str.charAt(str.length()-1)));
        mapWords.forEach((key,val) -> {System.out.println(key+ "\t" +val);
        });

    }
}
