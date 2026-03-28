package Streams;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FindFirstRepeated {
    public static void main(String[] args) {
        String input = "java stream API is very good concept";
        Set<Character> unique = new HashSet<>();
        Optional<Character> firstRepeated = input.chars()
                .mapToObj(c -> (char)c)
                .filter(c-> !unique.add(c))
                .findFirst();
        if(firstRepeated.isPresent()) {
            Character c1 = firstRepeated.get();
            System.out.println(c1);
        }

    }
}
