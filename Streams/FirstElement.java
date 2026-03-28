package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("apple", "orange", "pineapple", "papaya", "berry", "strawberry", "kiwi", "berry", "kiwi");
        Optional<String> optstr = firstEle.stream()
                .filter(str->str.startsWith("p"))
                .findFirst();
        if (optstr.isPresent()) {
            String val = optstr.get();
            System.out.println(val);
        }
    }
}
