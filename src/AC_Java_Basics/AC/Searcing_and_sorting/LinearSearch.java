package AC_Java_Basics.AC.Searcing_and_sorting;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,434,56,78,-98,98,69,57,354,2667};
        Scanner inp = new Scanner(System.in);
        int target = inp.nextInt();
        System.out.print(linear(arr,target));
    }
    static int linear(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
