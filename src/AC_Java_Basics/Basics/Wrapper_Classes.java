package AC_Java_Basics.Basics;

public class Wrapper_Classes {
    public static void main(String[] args) {
        int x1=40,x2=40;
        if(x1==x2){
            System.out.println("same");}
        else{
            System.out.println("Not same");
        }
        Integer x3=40,x4=40;
        if(x3==x4){ //here for smaller values in wrapper classes java caches it and gives you same
            System.out.println("Same");
        }
        else{
            System.out.println("Not same");
        }
        Integer x5=400,x6=400;//two different objects checking in heap memory pointing to two different locations
        if(x5==x6){//but in case of larger values it gives not same because wrapper classes are basically objects
            System.out.println("Same");
        }
        else{
            System.out.println("Not same");
        }
        Integer x7=40,x8=40;
        if(x7.equals(x8)){//two different object pointing to two different locations but have the same value which
            //.equals() searches for
            System.out.println("Same");
        }
        else{
            System.out.println("Not same");
        }
        int x9=100;
        Integer x10=x9; //autboxing
        int x11=x10;//auto-unboxing
        System.out.println(x9);
        System.out.println(x10);
        System.out.println(x11);

    }
}
