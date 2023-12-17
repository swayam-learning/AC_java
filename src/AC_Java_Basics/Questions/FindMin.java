package AC_Java_Basics.Questions;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
//        int[] arr = {18, 12, -7, 3, 14, 28};
//        System.out.println(Arrays.stream(arr).min().getAsInt());
        int[][] arr2D = {
                {18, 12, -7},
                {3, 14, 28},
                {-8, 8, 10}
        };

        // Using Arrays.stream to create a stream of arrays, and then flattening it
        int min = Arrays.stream(arr2D)
                .flatMapToInt(Arrays::stream)
                .min()
                .getAsInt();

        System.out.println("Minimum value in the 2D array: " + min);
    }
}
