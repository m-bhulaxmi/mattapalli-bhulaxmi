package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RevListOfInteger {
    public static void main(String[] args) {
        List<Integer> revNum = Arrays.asList(11, 11, 1, 3, 5, 6, 5);
        List<Integer> list1 = revNum.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                        .collect(Collectors.toList());
        System.out.println("With comparing:" +list1);

        List<Integer> list2 = revNum.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("With ReverseOrder():" +list2);

        /*List<Integer> list3 = revNum.stream()
                .sorted(Comparator.naturalOrder().reversed())
                .collect(Collectors.toList());
        System.out.println("With naturalOrder(): " +list3); */

        List<Integer> list4 = revNum.stream()
                .sorted((a,b) -> b-a)
                .collect(Collectors.toList());
        System.out.println("With b-a: " +list4);
    }
}
