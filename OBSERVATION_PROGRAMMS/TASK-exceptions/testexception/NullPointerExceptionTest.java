package testexception;

import java.util.Scanner;

public class NullPointerExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name or leave it empty: ");
        String name = sc.nextLine();

        //empty name is changed to null
        if (name.isEmpty()) {
            name = null;
        }

        try {
            //exception occurs when name is null
            System.out.println("Name length: " + name.length());
        } catch (NullPointerException exception) {
            //catch handles the exception
            System.out.println("Name cannot be null.");
        } finally{
            System.out.println("Name check completed.");
            sc.close();
        }
    }
}
