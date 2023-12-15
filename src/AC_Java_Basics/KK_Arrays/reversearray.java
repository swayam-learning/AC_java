package AC_Java_Basics.KK_Arrays;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {29,36,45,23,19,69};
        int start = 0;
        int end = arr.length-1;
        reverse(arr,start,end);
    }

    private static void reverse(int[] arr, int start, int end) {
        if (arr.length != 0) {
            while (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
            System.out.println(Arrays.toString(arr));
        }
        if (arr.length == 0){
            System.out.println("empty array");
        }

    }
    private static void swap(int[] arr,int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1]= temp;
    }
}
