package AC_Java_Basics;

public class SixthVideo_patterns {
    public static void main(String[] args) {
//Question(1).Solid Rectangle
//*****
//*****
//*****
//*****

        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

// rows are formed with the help of outer loops and columns are done with the help of inner loops

// Question(2). Hollow Rectangle
// *****
// *   *
// *   *
// *****

        for (int i = 1; i <=4  ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

//Question(3).Half Pyramid
//*
//**
//***
//****

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

//Question(4).Inverted Half Pyramid
//****
//***
//**
//*

        for (int i = 4; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

//Question(5). Inverted Half Pyramid(rotated by 180 degree)
//   *
//  **
// ***
//****

        int n =4;
        for (int i = 1; i <=n ; i++) {
            //inner loop --> space print
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //inner loop --> print star
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

//Question(6). Half Pyramid(in numbers)
//        1
//        12
//        123
//        1234
//        12345
//
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

// Question(7). Inverted Half Pyramid(in numbers)
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
                }
            System.out.println();

        }

//// Question(8). Half Pyramid(in numbers)
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

        int count = 1 ;
        for (int i = 1; i <=5  ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
// Question(8).0-1 Triangle
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

        int m=5;
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= i ; j++) {
                if((i+j)%2==0) {
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();}



    }
}
