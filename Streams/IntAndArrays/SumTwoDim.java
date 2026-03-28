import java.util.HashSet;
import java.util.Set;

public class SumTwoDim{
    public static void main(String args[]) {
        String input = "Java Articles are Awesome";
//        Set<Character> seenCharacters = new HashSet<>();
//
//
//        Character firstRepeated = input.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> !seenCharacters.add(c))
//                .findFirst()
//                .orElse(null);
//
//        System.out.println("First repeated character: " + firstRepeated);
        Character firstNonRepeated = input.chars().mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst().orElse(null);
        System.out.println("First repeated character: " + firstNonRepeated);
    }
}