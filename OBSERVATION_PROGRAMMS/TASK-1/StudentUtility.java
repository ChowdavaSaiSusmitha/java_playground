package basics;

import java.util.Scanner;

public class StudentUtility {
    // Factorial method
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
       return fact;
    }
    // Prime Number method
    static boolean Prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    // Maximum method
    static int maximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    // Area of circle method
    static int area(int r) {
        return (int)(3.14 * r * r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Part A: Student Details
        System.out.println("Student details");
        System.out.println("Enter a student name: ");
        String name = sc.next();
        System.out.println("Enter student roll no: ");
        int rollno = sc.nextInt();
        System.out.println("Enter student marks: ");
        int[] marks = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        double percent = (double) total / marks.length;
        System.out.println("Percentage: " + percent);
        System.out.println("Total marks: " + total);
        // Grade
        if (percent >= 90)
            System.out.println("Grade A++");
        else if (percent >= 80)
            System.out.println("Grade A");
        else if (percent >= 70)
            System.out.println("Grade B");
        else if (percent >= 60)
            System.out.println("Grade C");
        else
            System.out.println("Fail in Exam");
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println(" 1. Even or odd\n2. Largest of three numbers\n3. Day of week\n4. Multiplication table\n5. Numbers (1 to N)");
            System.out.println("6. Sum of N natural numbers\n7. Fibonacci series\n8. Method\n9. Exit");

            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter n: ");
                    int n = sc.nextInt();

                    if (n % 2 == 0)
                        System.out.println("Even number");
                    else
                        System.out.println("Odd number");

                    break;

                case 2:
                    System.out.println("Enter 3 numbers: ");

                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();

                    if (a > b && a > c)
                        System.out.println(a + " is larger number");
                    else if (b > a && b > c)
                        System.out.println(b + " is larger number");
                    else
                        System.out.println(c + " is larger number");

                    break;

                case 3:
                    System.out.println("Enter day: ");
                    int day = sc.nextInt();

                    switch (day) {
                        case 1:
                            System.out.println("Sunday");
                            break;
                        case 2:
                            System.out.println("Monday");
                            break;
                        case 3:
                            System.out.println("Tuesday");
                            break;
                        case 4:
                            System.out.println("Wednesday");
                            break;
                        case 5:
                            System.out.println("Thursday");
                            break;
                        case 6:
                            System.out.println("Friday");
                            break;
                        case 7:
                            System.out.println("Saturday");
                            break;
                        default:
                            System.out.println("Invalid day");
                    }
                    break;
                case 4:
                    System.out.println("Enter multiplication table: ");
                    int x = sc.nextInt();
                    for (int i = 0; i <= 20; i++) {
                        System.out.println(x + " * " + i + " = " + (x * i));
                    }
                    break;
                case 5:
                    System.out.println("Enter Natural number (N): ");
                    int y = sc.nextInt();
                    for (int i = 0; i <= y; i++) {
                        System.out.println(i);
                    }
                    break;
                case 6:
                    System.out.println("Enter N number: ");
                    int z = sc.nextInt();
                    int sum = 0;
                    for (int i = 0; i <= z; i++) {
                        sum += i;
                    }
                    System.out.println("Sum of N natural numbers: " + sum);
                    break;
                case 7:
                    System.out.println("Enter Fibonacci series (N): ");
                    int N= sc.nextInt();
                    int a1 = 0;
                    int b1 = 1;
                    for (int i = 0; i < N; i++) {
                        System.out.print(a1 + " ");
                        int next = a1 + b1;
                        a1 = b1;
                        b1 = next;
                    }
                    break;
                case 8:
                    System.out.println("1. Factorial\n2. Prime\n3. Maximum\n4. Area\nEnter method choice: ");
                    int method = sc.nextInt();
                    switch (method) {
                        case 1:
                            int f = factorial(10);
                            System.out.println("Factorial is " + f);
                            break;
                        case 2:
                            boolean p = Prime(5);
                            System.out.println("Prime is " + p);
                            break;
                        case 3:
                            int M = maximum(14, 19);
                            System.out.println("Maximum number is " + M);
                            break;
                        case 4:
                            double result = area(3);
                            System.out.println("Area of circle: " + result);
                            break;
                        default:
                            System.out.println("No method");
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid number");
            }
        } while (choice != 0);
        sc.close();
    }
}

