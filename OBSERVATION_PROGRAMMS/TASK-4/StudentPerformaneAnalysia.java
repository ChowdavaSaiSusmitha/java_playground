package oops;

import java.util.Scanner;
//import the Student class from the basics package
import basics.Student;

// Student performance analysis class
//Student class inherited by StudentPerformanceAnalysis class using protected keyword
public class StudentPerformaneAnalysia extends Student {

    // Constructor to initialize student details
    public StudentPerformaneAnalysia(String name, int RollNo, int[] marks) {
        super(name, RollNo, marks);
    }

    // Method to calculate total marks
    int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate average marks
    double getAverageMarks() {
        return (double) getTotalMarks() / marks.length;
    }

    // Method to find highest marks
    int getHighestMarks() {
        int highest = marks[0];
        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }
        return highest;
    }

    // Method to find lowest marks
    int getLowestMarks() {
        int lowest = marks[0];
        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }
        return lowest;
    }

    // Method to calculate percentage and round it to two decimal places
    double getPercentage() {
        double percentage = (double) getTotalMarks() / (marks.length * 100) * 100;
        return Math.round(percentage * 100) / 100.0;
    }

    // Method to assign grade based on percentage
    String getGrade() {
        double percentage = getPercentage();
        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    // Method to determine pass or fail
    boolean isPassed() {
        return getPercentage() >= 50;
    }

    // Method to display performance remark
    String getRemark() {
        switch (getGrade()) {
            case "A+":
                return "Outstanding performance";
            case "A":
                return "Excellent performance";
            case "B":
                return "Very good performance";
            case "C":
                return "Good performance";
            case "D":
                return "Needs improvement";
            default:
                return "Work harder for better results";
        }
    }

    // Method to display complete student performance report
    void displayDetails() {
        String formattedName = name.trim().toUpperCase();
        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        // Calculate total, highest and lowest marks in one loop
        for (int mark : marks) {
            total += mark;
            highest = Math.max(highest, mark);
            lowest = Math.min(lowest, mark);
        }

        double average = (double) total / marks.length;
        double percentage = Math.round((double) total / marks.length * 100) / 100.0;
        String grade;
        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        String remark;
        switch (grade) {
            case "A+":
                remark = "Outstanding performance";
                break;
            case "A":
                remark = "Excellent performance";
                break;
            case "B":
                remark = "Very good performance";
                break;
            case "C":
                remark = "Good performance";
                break;
            case "D":
                remark = "Needs improvement";
                break;
            default:
                remark = "Work harder for better results";
        }

        System.out.println("\nStudent Performance Report");
        System.out.println("Name: " + formattedName);
        System.out.println("Name Length: " + formattedName.length());
        System.out.println("Roll Number: " + RollNo);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (percentage >= 50 ? "Pass" : "Fail"));
        System.out.println("Remark: " + remark);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student roll number: ");
        int RollNo = sc.nextInt();

        // Store marks of five subjects in an array
        int[] marks = new int[5];
        System.out.println("Enter marks of five subjects: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // Create object and display performance report
        StudentPerformaneAnalysia st = new StudentPerformaneAnalysia(name, RollNo, marks);
        st.displayDetails();

        sc.close();
    }
}