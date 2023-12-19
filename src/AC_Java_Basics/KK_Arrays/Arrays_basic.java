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
// arrays in general are contiguous memory location but array objects in java may not be contiguous
// because they are stored in heap
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
//arrays by default contains 0 or 0.0 or null in case of int ,float,string respectively
        System.out.println(Arrays.toString(arr)); // to show the array values without using for loop
        Arrays.stream(arr).max();
/* In Java, the reference to the array (variable a in your example)
is stored in the stack memory, but the actual array (the object) is stored in the heap memory.

Here's a breakdown of what happens:

Reference (variable a) in Stack: The variable a itself,
which is a reference to the array object, is stored in the stack memory.
The size of this reference is constant, regardless of the size of the array.

int[] a = new int[5];
// 'a' is a reference, and it's stored in the stack
Array Object in Heap: The array object, created using new int[5], is stored in the heap memory.
The heap memory is used for dynamic memory allocation, and it is where objects live. T
he actual elements of the array are part of this object and are also stored in the heap.*/

    }

}
