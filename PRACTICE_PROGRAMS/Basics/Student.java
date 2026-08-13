package basics;
import java.util.Scanner;

public class Student {
    String name;
    int RollNo;
    int[] marks;

    public Student(String name, int RollNo, int[] marks) {
        this.name = name;
        this.RollNo = RollNo;
        this.marks = marks;
    }
    
    int getTotalMarks() {
        int total = 0;
        for (int i:marks) {
            total += i;
        }
        return total;
    }
     
    void percentage(){
        int total = getTotalMarks();
        double percent = (double) total / marks.length;
        System.out.println("Percentage: " + percent);
    }

    void displayDetails(){
       System.out.println("Name: " + name);
       System.out.println("Roll Number: " + RollNo);
       System.out.println("Marks: ");
       for (int mark : marks) {
           System.out.print(mark + " ");
       }
       System.out.println();
       int total = getTotalMarks();
       System.out.println("Total Marks: " + total);
       percentage();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.next();

        System.out.print("Enter student roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter student marks: ");
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }

        Student s = new Student(name, rollNo, marks);
        s.displayDetails();

        sc.close();
    }
}
