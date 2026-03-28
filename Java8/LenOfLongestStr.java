package Java8;

import java.util.Arrays;

/**
 * Given array of strings, write a java8 program to find the length of the longest string
 */
public class LenOfLongestStr {
    public static void main(String[] args) {
        String[] str = {"Apple", "Banana", "Avacado", "Apricot", "Grapes"};
        int maxLength = Arrays.stream(str)
                .mapToInt(str1 ->str1.length()).max().orElse(0);
        System.out.println(maxLength);
    }
}
