package AC_Java_Basics.Basics;
class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    //the above is also called a blueprint.
    public void printColor(){
        System.out.println(this.color);  //here the value of color is being called
    }
//    pen(){//this is non-paramterised constructor
//        System.out.println("constructor called");
//    }
    pen(String color,String type){
        this.color=color;
        this.type=type;
        System.out.println("color of the pen is "+color+" and the type of pen is "+type);
    }
}
//class Students {
//    String name;
//    int rollno;
//    int age;
//    String university_name;
//
//    public void printName(){
//        System.out.println("Name of the student is "+this.name+" and his/her age is "+this.age);
//    }
//}
public class OOPS2 {
    public static void main(String[] args) {
        //object of a class is made in main function
        pen pen1 =new pen("Black","gel");//we created a pen1 object this is called constructors and can only be called  once and there is no return type
        pen1.color = "Blue";  // this is being called
        pen1.type="Gel";
        pen1.write();
//        pen2.color="Black"; // this is being called
//        pen2.type="Ballpoint";

    }}
//public class OOPS2 {
//    public static void main(String[] args) {
//        Students student1 = new Students();
//
//        student1.name = "Swayam";
//        student1.age = 20;
//        student1.printName();
//    }
//}

