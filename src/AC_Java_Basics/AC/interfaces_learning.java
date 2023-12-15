package AC_Java_Basics.AC;
interface animals{
    void run();// by default this is public
    int eyes  = 2; //the no of eyes is fixed called static
    // interfaces do not contain constructor and cannot contain non-abstract functions
    //interfaces can have only public , static ,
}
interface omnivore{
    void eat();
}
class dog implements animals,omnivore{
    //this  is called multiple inheritance and can only be implemented using interfaces
    @Override
    public void run(){
        System.out.println("walks on 4 dogs");
    }

    @Override
    public void eat() {
        System.out.println("eats veg and non-veg food");
    }
}
public class interfaces_learning {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.run();
        d1.eat();
    }
}
