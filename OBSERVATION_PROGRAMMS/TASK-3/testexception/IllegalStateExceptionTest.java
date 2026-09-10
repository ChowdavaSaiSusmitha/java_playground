package testexception;

import java.util.Scanner;

public class IllegalStateExceptionTest {
    private static String country;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a country: ");
        country = sc.nextLine();

        try {
            showCountry();
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Country check completed.");
            sc.close();
        }
    }

    private static void showCountry() {
        if (country.isBlank()) {
            throw new IllegalStateException("No country was entered.");
        }
        System.out.println("You selected: " + country);
    }
}
