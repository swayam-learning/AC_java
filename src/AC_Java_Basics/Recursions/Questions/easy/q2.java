package AC_Java_Basics.Recursions.Questions.easy;

public class q2 {
    public static void main(String[] args) {
        //Print N to 1 without loop
        int i=10;
        printNumbers(i);
    }

    private static void printNumbers(int i) {
        if(i>0){
            System.out.print(i+" ");
            printNumbers(i-1);
        }
    }

}
