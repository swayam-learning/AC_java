package AC_Java_Basics.kk_functions;

public class shadowing {
    static int x=90;// it will available to it's scope
    //and will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x=40;//scope will begin when the value is initialised adn not when the variable is declared
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
