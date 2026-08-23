package inheritance;
//hierachial inheritance
class College {
    void getCollegeName() {
        System.out.println("College name is: ANITS College");
    }
}

class Student1 extends College {
    void getStudentName() {
        System.out.println("Student name is: Prabhash");
    }
}

class Student2 extends College {
    void getStudentName() {
        System.out.println("Student name is: Anushka");
    }
}

class Student3 extends College {
    void getStudentName() {
        System.out.println("Student name is: Yash");
    }
}
// 3 classes inherites the same parent class
public class Hierachial {
    public static void main(String[] args) {
        //creating objects for different classes which inherites from parent class

        Student1 s1 = new Student1();
        s1.getStudentName();

        Student2 s2 = new Student2();
        s2.getStudentName();
        s2.getCollegeName();

        Student3 s3 = new Student3();
        s3.getStudentName();

        //parent class object
        College s4=new Student1();
        s4.getCollegeName();
    }
}
