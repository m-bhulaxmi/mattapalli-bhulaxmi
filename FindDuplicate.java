import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;
/* find duplicates */
public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,2,4,9);
        Set<Integer> unique = new HashSet<>();
        List<Integer> duplicate = numbers.stream()
                .filter(s-> !unique.add(s))
                .collect(Collectors.toList());
        System.out.println(duplicate);
    }
}
