package AC_Java_Basics;
public class SeventhVideo_advancePatterns {
    public static void main(String[] args) {
// Question(10). Butterfly pattern
//     *****
//    *****
//   *****
//  *****
// *****
//        int n = 5;
//        for (int i = 0; i <n ; i++) {
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 5 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

// Question(11). Number pyramid
//          1
//         2 2
//        3 3 3
//       4 4 4 4
//      5 5 5 5 5

//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=5-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();}

// Question(12). Number pyramid
//           1
//          212
//         32123
//        4321234
//       543212345

//        for (int i = 1; i<=5 ; i++) {
//            for (int j = 1; j <= 5-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//            for (int j = 2; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

// Question(13). diamond
//    *
//   * *
//  * * *
// * * * *
//* * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();}
        for (int i = 5; i >=1 ; i--) {
            for (int j = 5-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();}
        }
        }


