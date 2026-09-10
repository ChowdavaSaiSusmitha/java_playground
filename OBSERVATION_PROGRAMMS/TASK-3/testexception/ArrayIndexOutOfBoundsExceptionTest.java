package testexception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30};
        System.out.print("Enter an array index : ");

        try {
            //wrong index causes exception
            int index = sc.nextInt();
            System.out.println("Value: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            //catch handles wrong index
            System.out.println("The array index is outside the valid range.");
        } finally {
            //finally always runs
            System.out.println("Array check completed.");
            sc.close();
        }
    }
}
