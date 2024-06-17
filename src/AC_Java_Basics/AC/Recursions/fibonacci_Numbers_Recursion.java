package AC_Java_Basics.AC.Recursions;

public class fibonacci_Numbers_Recursion {
   static int n=10;

    public static void main(String[] args) {
        int i=1;
        fibo(0,1,i);
    }

    private static void fibo(int a ,int b,int i) {
        int temp=a;
        System.out.print(a+" ");
        a=b;
        b=b+temp;
        if(i==n)
        {
            return;
        }
        fibo(a,b,i+1);
    }
}
