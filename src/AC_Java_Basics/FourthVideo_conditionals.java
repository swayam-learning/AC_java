package AC_Java_Basics;

import java.util.*;

public class FourthVideo_conditionals {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int age = inp.nextInt();
//        if(age<18) {
//            System.out.println("Not adult");
//        } else {
//            System.out.println("Adult");
//        }
// if we are using if without a curly brace only a single will get executed.
//        if(age<18)
//            System.out.println("Not Adult");
        switch(age){
            case 12:
                System.out.println("hello");
                break;
            case 18:
                System.out.println("Adult");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
