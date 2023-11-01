package AC_Java_Basics.kk_functions;

public class Internal_working_functions {
    public static void main(String[] args) {
        int a =10;
        int b=20; //there copies are passed as value to the swap() so they remain intact
        //a----->10 b---->20
        swap(a,b);//this is just useless
        System.out.println(a+" "+b);//the value has not een swapped
        // here the original value is still intact a----->10 b---->20
    }

    static void swap(int a , int b) {
        int temp = a;
        a=b;
        b=temp;
//  a----->20 b----->10
//  here in this step we are not changing the original value rather we are working on a copy of the reference so in terms here a=20 and b=10 but
//  the original value of and b in  the main function still holds true
    }
}
