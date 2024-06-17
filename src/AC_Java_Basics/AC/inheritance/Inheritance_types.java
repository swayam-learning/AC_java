package AC_Java_Basics.AC.inheritance;
class Shapes {
    public void area() {
        System.out.println("Displays area");
    }
}
 class Triangles extends Shapes{
     public void area(double length,double height){
         System.out.println((1.0/2)*length*height); //here we write 1.0/2 or 0.5 to get floating point answer if we write 1/2 it calculates to zero
     }//till this point it single level inheritance
 }
 class EquilateraslTriangle extends Triangles{
    public void area(int l,int h){
        System.out.println(1.0/2*l*h);
    }//till this point it is multilevel inheritance
 }
class Circle extends Shapes{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }//hierarchical inheritance
}
//multiple inheritance is used using interfaces and not classes.
//in the case of  multiple inheritance it throws the error a class cannot call multiple classes.
public class Inheritance_types {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        s1.area();
        Triangles t1 = new Triangles();
        t1.area(4,5);
        EquilateraslTriangle e1 = new EquilateraslTriangle();
        e1.area(4,4);
        Circle c1 = new Circle();
        c1.area(4);
    }

}
