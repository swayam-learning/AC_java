package AC_Java_Basics.kk_functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,56,67);
//        multiple(20,10,34,54,67,89,69);
    }
//    static void multiple(int a, int b ,int ...v )
//    {
//    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
