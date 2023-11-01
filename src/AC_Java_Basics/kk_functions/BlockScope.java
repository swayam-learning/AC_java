package AC_Java_Basics.kk_functions;

public class BlockScope {
    public static void main(String[] args) {
        int a =20;
        int b=30;
//        int a=50; this gives an error as we cannot initialise the value again;
        a=40;//no error as we are not initialising te same variable again;
        {
//            int a =70;//this will also give error because the variable a is already initialised inside a block
            a=70; // but definitely we can change the value
//            int c=99; this cannot be printed outside this scope
        }
        System.out.println(a);//the final value is printed
    }
}
