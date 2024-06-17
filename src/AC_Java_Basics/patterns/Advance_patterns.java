package AC_Java_Basics.patterns;

public class Advance_patterns {
    public static void main(String[] args) {
//      **********
//      ****  ****
//      ***    ***
//      **      **
//      *        *
//      *        *
//      **      **
//      ***    ***
//      ****  ****
//      **********
        for (int i = 0; i <10 ; i++) {
            for (int j = 10; j >i ; j--) {
                {
                    for (int k = 0; k < 2*i; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();

            }

        }

        }
}
