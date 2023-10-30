package AC_Java_Basics.inheritance;
class shape{
    String color;
}
class triangle extends shape{
    //here triangle class inherits class shape
    // inheritance increases reusability
    //the shape class is called the base class and the triangle class is called child class
    //in java there are five types of inheritance
    //1.single level inheritance
}

public class inheritance {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.color="red";
    }
}

