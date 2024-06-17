package AC_Java_Basics.AC.Recursions;

public class whyRecursions {
    public static void main(String[] args) {
                // write a function,that prints hello world
        message(1);
    }
    static void message(int n){
        System.out.println(n);
        message1(2);
    }
    static void message1(int n){
        System.out.println(2);
        message2(3);
    }static void message2(int n){
        System.out.println(3);
        message3(4);
    }static void message3(int n){
        System.out.println(4);
        message4(5);
    }static void message4(int n){
        System.out.println(n);
// when a function finishes execution it is removed from the stack and the flow of program will be returned
        // why Recursion? it helps us in solving bigger complex problems easily
        // you can convert recursion solution into iteration and vice - versa
    }
}
