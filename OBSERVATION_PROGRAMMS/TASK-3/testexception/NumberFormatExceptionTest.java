package testexception;

import java.util.Scanner;

public class NumberFormatExceptionTest {
    public static void main(String[] args) {
        //taking number as text
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        String text = sc.nextLine();

        try {
            //converting text into number
            int n = Integer.parseInt(text);
            System.out.println("Number: " + n);
        } catch (NumberFormatException exception) {
            //catch handles wrong number format
            System.out.println("The text is not a valid integer.");
        } finally {
            System.out.println("Number check completed.");
            sc.close();
        }
    }
}
