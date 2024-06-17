package AC_Java_Basics.Basics;
abstract class animal{ //only a blueprint we don't really care about its existence
    abstract void walk();// this is called final class
    animal(){
        System.out.println("first called "+" you are creating an animal");
    }
}
class horse extends animal{
    horse(){
        System.out.println("this will be called after animal  "+" creating horse");
    }
    @Override
    public void walk() {
        System.out.println("walks on 4 legs");
    }

}
class chicken extends animal{
    @Override
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
    horse h1 = new horse();
    h1.walk();
    chicken c1 = new chicken();
    c1.walk();
 // we cannot create an object of animal class because it is an abstract class  and if we create it will give runtime error.
        //abstract class can have abstract as well non-abstract functions  and it need to define with abstract keyword
        //it cannot be instantiated
        // for eg if we create a constructor inside animal class called animal and have this constructor print"You are creating an animal" and inside the horse class we create
        // horse constructor and print "created a horse" and when just create the horse object then first the animal constructor will be called and later on the
        //horse constructor will be called. this is called constructor chaining.
        //so whenever a class is deriving from a parent class then the parent class constructor is called first and then the child class constructor is called ,
        //this is called constructor chaining.


    }
}
