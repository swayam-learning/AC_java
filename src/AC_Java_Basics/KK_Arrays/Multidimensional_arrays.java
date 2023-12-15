package AC_Java_Basics.KK_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];//2d arrays  new int[rows][columns] adding no of rows is mandatory but adding columns is not mandatory
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {//rows
            for (int j = 0; j < 3; j++) {//columns
                arr[i][j] = inp.nextInt();
            }
            // no of rows
        }
        System.out.println(arr.length);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//
//        }
        for(int[] a: arr){//enhanced for loop
            System.out.println(Arrays.toString(a));
        }
    }
}
