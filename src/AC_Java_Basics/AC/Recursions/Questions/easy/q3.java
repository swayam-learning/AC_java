package AC_Java_Basics.AC.Recursions.Questions.easy;

public class q3 {
    //sum of natural numbers using recursion

//    static int sum=0;
//    public static void main(String[] args) {
//        //sum of natural numbers using recursions
//        int n= 15;
//        System.out.println(sumNatural(n));
//    }
//
//    private static int sumNatural(int n) {
//        if(n>0){
//            sumNatural(n-1);
//            sum=sum+n;
//        }
//        return sum;
//   }
        public static void main(String[] args)
            {
                int n = 5;
                System.out.println(recurSum(n));
            }
            public static int recurSum(int n)
            {
                if (n <= 1)
                    return n;
                    return n + recurSum(n - 1);
            }

            // better approach

        }


