package AC_Java_Basics;

public class FifthVideo_loops {
    public static void main(String[] args) {
        //for loops
//        for (int i = 0; i < 4; i++) {
//            System.out.println("this will be printed 4 times");
//        }
//        //while loop
//        int i = 0;
//        while (i < 4) {
//            System.out.println("this will be printed 4 times using while loops");
//            i++;
//        }
//        // do while
//        i = 0;
//        do {
//            System.out.println("this is printed 4 times using do-while loop");
//            i++;
//        }while(i<4);
int n=4,sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
