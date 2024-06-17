package AC_Java_Basics.AC.Recursions;

public class recursions_basics {
    public static void main(String[] args) {
        message(1);
    }

    private static void message(int n) {
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        message(n+1);
    }// the recursion may encounter you into stack overflow so
    // we always need to create a base condition  to stop our recursion from making new calls in order to not encounter StackOverflow Error
// if function is called again and again it will be treated as different function in the stack memory
 /*
    1. Identify if you can break the problem into smaller steps
    2. Write the recurrence relations
    3.draw the recursive tree
    4.in the tree
        i. see the flow of functions , how they are getting started
        ii. identify & focus on left tree calls and right tree calls
        iii.draw the tree and pointer again and again using pen and paper and on a debugger
     5.see how they values are returned at each step and see when it comes out of the
       function and the end you will come out of the function.
     */
}

