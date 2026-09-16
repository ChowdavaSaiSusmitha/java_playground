package testexception;

import java.util.Scanner;

public class IllegalArgumentExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            setAge(age);
        } catch (IllegalArgumentException exception) {
            //catch handles wrong argument
            System.out.println(exception.getMessage());
        } finally{
            System.out.println("Age check completed.");
            sc.close();
        }
    }

    private static void setAge(int age) {
        if (age < 0) {
            //negative age is not allowed
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Age set to " + age);
    }
}
