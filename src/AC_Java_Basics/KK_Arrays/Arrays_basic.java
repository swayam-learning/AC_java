package AC_Java_Basics.KK_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_basic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
// arrays in general are contiguous memory location but array objects in java may not be contiguous because they are stored in heap
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
//arrays by default contains 0 or 0.0 or null in case of int ,float,string respectively
        System.out.println(Arrays.toString(arr)); // to show the array values without using for loop
    }

}
