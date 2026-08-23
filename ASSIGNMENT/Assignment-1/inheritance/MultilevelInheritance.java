package inheritance;

//parent class
class College{
    void getCollegeName(){
         System.out.println("College name is: ANITS College");
    }
}
//class child1 inherites parent college class
class Department extends College{
    void getDepartmentName(){
        System.out.println("Department name is: CSE(AIML)");
    }
}

//class child2 inherites  child1 class 
class Student extends Department{
    void getStudentName(){
        System.out.println("Student name is: sushant singh rajput");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        //creating a single object for all classes to access details in respective classes
        Student s = new Student();
        s.getCollegeName();
        s.getDepartmentName();
        s.getStudentName();
    }
}
