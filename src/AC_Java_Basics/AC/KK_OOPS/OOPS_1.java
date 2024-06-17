package AC_Java_Basics.AC.KK_OOPS;
import java.util.Scanner;
public class OOPS_1 {
    public static void main(String[] args) {
//        class is named group of properties and functions
        Scanner inp = new Scanner(System.in);//new keyword dynamically allocates memory and returns a reference to it
        System.out.println("How many student inputs do you want to input");
        int n = inp.nextInt();
        //the other way around is using next()
        for (int i = 0; i < n ; i++) {
            inp.nextLine();//this consumes the extra left in the input stream by the in without this the string nextLine will not work
            String name = inp.nextLine();
            int rno = inp.nextInt();
            int marks = inp.nextInt();
            Student s1 = new Student(name, rno, marks);
//       <----------->   <---------------------------->
//      at compile time //at run time
            s1.printinfor();
        }
    }
    public static class  Student{
        int rno;
        String name;
        int marks;
        Student(String name,int rno,int marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks;
        }
        void printinfor(){
            System.out.println("the name of the student is "+this.name);
            System.out.println("the roll  no of the student is "+this.rno);
            System.out.println("the marks of the student is "+this.marks);
        }
    }
}
