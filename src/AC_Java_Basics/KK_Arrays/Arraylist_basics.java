package AC_Java_Basics.KK_Arrays;

import java.util.ArrayList;

public class Arraylist_basics {
    //    it is similar to vectors in c++
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        {
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);
            list.add(80);
            list.add(90);
            list.add(100);
            list.add(120);
            list.add(130);
            list.add(140);
            System.out.println(list);
            System.out.println(list.get(3));
        }//Integer is wrapper classes

    }
}


