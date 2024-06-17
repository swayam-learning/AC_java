package AC_Java_Basics.AC.Recursions;

public class fibonacci_Recursion_optimal {//this code provides you the nth fibonacci number
    public static void main(String[] args) {
        int ans = fibo(10);
        //general  fibo(n)=fibo(n-1)+fibo(n-2)
        // if we want to know we can solve a problem with recursion we can try to break the problem into smaller problems
        // this is also known as recurrence relations
  /*
                             fibo(4)  (return to main)
                 (7)        /    \    (8)
                (1)        /      \    (11)
                          /        \
                    fibo(3)   +   fibo(2)
           (2)      / \  (6)     (9) / \ (10)
                   /   \            /   \
          (5)     /     \          /     \
                 /       \        /       \
             fibo(2) + fibo(1)  fibo(1) +  fibo(0)
             /   \
      (3)   /     \  (4)
           /       \
        fibo(1) + fibo(0)
   */
        System.out.println(ans);
    }

    private static int fibo(int n) {
         if(n<2){
             return n;
         }
        return fibo(n-1)+fibo(n-2);
    }

}
