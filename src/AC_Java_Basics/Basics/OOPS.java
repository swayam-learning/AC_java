package AC_Java_Basics.Basics;
class student {
    String name;
    int age;
    int rollno;
    String courseStudy;
    String Hostel;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
        System.out.println(this.courseStudy);
        System.out.println(this.Hostel);
    }
//   student()  //non-parameterised constructor
//   {
//       System.out.println("here Constructor is called");
//   }
//}
//public class OOPS {
//    public static void main(String[] args) {
//        student s1 = new student(); //constructors to construct objects same name as class and no return type and called only once
//        s1.name="swayam";
//        s1.age=20;
//        s1.rollno=22;
//        s1.courseStudy="B.tech C.S.E";
//        s1.Hostel = "Bh1";
//
//        s1.printInfo();
//    }
//}
//    student(String name,int age){//parameterised constructor
//        System.out.println("Here constructor is called first");
//        this.name=name;
//        this.age=age;
//    }
//}
//    public class OOPS {
//        public static void main(String[] args) {
//            student s1 = new student("Swayam", 20); //constructors to construct objects same name as class and no return type and called only once
//
//            s1.printInfo();
//        }
//    }

//    public class OOPS {
//        public static void main(String[] args) {
//            student s1 = new student(); //constructors to construct objects same name as class and no return type and called only once
//            s1.name = "swayam";
//            s1.age = 20;
//            s1.rollno = 22;
//            s1.courseStudy = "B.tech C.S.E";
//            s1.Hostel = "Bh1";
//
//            s1.printInfo();
//        }
//    }
}

