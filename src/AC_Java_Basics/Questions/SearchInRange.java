package AC_Java_Basics.Questions;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your target");
        int target = inp.nextInt();
        System.out.println("enter the start value");
        int start = inp.nextInt();
        System.out.println("enter the end range value");
        int end = inp.nextInt();
        System.out.println(search(arr, target, start, end));
    }

    private static boolean search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }
        if(end<arr.length) {
            for (int i = start; i <= end; i++) {
                if (target == arr[i]) {
                    return true;
                }
            }
        }
        return false;

    }
}
