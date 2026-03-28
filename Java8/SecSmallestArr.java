package Java8;

import java.util.Arrays;

/**
 * Given an array of integers, write java 8 program to find the second smallest element
 */
public class SecSmallestArr {
    public static void main(String[] args) {
        int[] arr = new int[] {5,2,8,3,1,1};
        int secSmallestEle = Arrays.stream(arr)
                .sorted()
                .distinct()
                .skip(1)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Array doesn't have second smallest element")
                );
        System.out.println(secSmallestEle);

    }
}
