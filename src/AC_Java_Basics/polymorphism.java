package AC_Java_Basics;

class vidyarthi{
    String name;
    int age;
    public void printinfo(String name)
    {
        this.name = name;
        System.out.println("name of the student is "+name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        vidyarthi s1=new vidyarthi();
        s1.age = 20;
        s1.printinfo("swayam");
        s1.printinfo(s1.age);
    }
}
//this is called function overloading that is the functions can have same name but the no of parameters should be different
// if the number of parameter is same then there return type should be different