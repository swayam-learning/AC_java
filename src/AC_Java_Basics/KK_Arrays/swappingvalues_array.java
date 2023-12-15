package AC_Java_Basics.KK_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swappingvalues_array {
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,98,69,87};
        Scanner inp = new Scanner(System.in);
        int index1 = inp.nextInt();
        int index2 = inp.nextInt();
        System.out.println(Arrays.toString(arr));
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int ind1,int ind2){
        int temp;
        temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
