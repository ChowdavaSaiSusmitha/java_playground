package testexception;

import java.util.Scanner;

public class MobileNumberValidation {

    public static void validateMobileNumber(String mobileNumber)
            throws LengthNotSufficientException {
        // Keep the input as text so leading zeroes are not lost.
        if (mobileNumber == null || !mobileNumber.matches("[0-9]*")) {
            throw new NumberFormatException();
        }

        if (mobileNumber.length() > 10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (mobileNumber.length() < 10) {
            throw new LengthNotSufficientException("Invalid Mobile Number – LengthNotSufficientException");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mobile number: ");

        try {
            String mobileNumber = scanner.nextLine();
            validateMobileNumber(mobileNumber);
            System.out.println("Valid number");
        } catch (ArrayIndexOutOfBoundsException exception) {
            // The exercise specifies this built-in exception for numbers over ten digits.
            System.out.println("Invalid Mobile Number-ArrayIndexOutofBounds Exception");
        } catch (LengthNotSufficientException exception) {
            // Report the custom exception used for numbers under ten digits.
            System.out.println(exception.getMessage());
        } catch (NumberFormatException exception) {
            // Reject letters and symbols instead of attempting numeric conversion.
            System.out.println("Invalid Mobile Number –NumberFormatException");
        } finally {
            // Close the input resource whether validation succeeds or fails.
            scanner.close();
        }
    }
}
