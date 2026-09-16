package testexception;

import java.util.Scanner;

public class ClassNotFoundExceptionTest {
    public static void main(String[] args) {
        //taking class name from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a class name: ");
        String name = sc.nextLine();

        try {
            //trying to find the class
            Class.forName(name);
            System.out.println("Class was found.");
        } catch (ClassNotFoundException exception) {
            //catch handles class not found
            System.out.println("Class was not found.");
        } finally {
            System.out.println("Class check completed.");
            sc.close();
        }
    }
}
