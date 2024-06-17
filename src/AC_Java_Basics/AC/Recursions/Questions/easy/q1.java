package AC_Java_Basics.AC.Recursions.Questions.easy;

public class q1 {
    //Print 1 to n without using loops
    public static void main(String[] args) {
        int i=10;
        func(i);

    }

    private static void func(int i) {
        if(i>0){
            func(i-1);
            System.out.println(i+" ");
        }

    }
}
