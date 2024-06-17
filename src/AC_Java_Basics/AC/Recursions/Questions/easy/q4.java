package AC_Java_Basics.AC.Recursions.Questions.easy;

public class q4 {
    // print factorial using recursion
    public static void main(String[] args) {
        int n =6;
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n<=1){
            return n;
        }
        return n*factorial(n-1);
    }
}
