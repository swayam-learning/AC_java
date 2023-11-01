package AC_Java_Basics.kk_functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        Q:to check a number is  prime or not
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        System.out.println(isPrimes(num));
        System.out.println(isPrime(num));}
//efficient method
    private static Boolean isPrimes(int number) {
        if(number<=1){
            return false;}
        else {
            int c =2;
            while(c*c<=number)
            {
                if(number%c==0){

                    return false;
                }
                c++;
            }
            return c*c>number;
        }

    }
//    my method
    private static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        else {
            for (int i = 2; i <=(number/2) ; i++) {
                if (number%i==0)
                {
                    return true;
                }
            }
            return false;
        }
    }
}
