package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given two arrays of integers, write java8 program to find the common elements between them.
 */
public class CommonEleBwArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8,1};
        List<Integer> commEle = Arrays.stream(arr1)
                .filter(num -> Arrays.stream(arr2).anyMatch(num2 -> num2==num))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(commEle);
    }

}
