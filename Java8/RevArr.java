package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Reverse array of integers
 */
public class RevArr {
    public static void main(String[] args) {
        int[] num = new int[] {1,2,3,4,5};
            IntStream.range(0, num.length / 2).forEach(i -> {
                int temp = num[i];
                num[i] = num[num.length - i - 1];
                num[num.length - i - 1] = temp;
            });
            System.out.println("Reversed Array: " + Arrays.toString(num));
        }
}

