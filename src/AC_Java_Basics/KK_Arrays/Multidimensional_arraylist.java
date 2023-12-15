package AC_Java_Basics.KK_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensional_arraylist {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        //intialise the arraylist
        for (int i = 0; i < 3; i++) {
            ls.add(new ArrayList<>());
        }
        //ading elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ls.get(i).add(inp.nextInt());
            }
        }
                System.out.println(ls);
            }

}