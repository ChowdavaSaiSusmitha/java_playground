package testexception;

// This custom class is needed because the question asks for a
// LengthNotSufficientException when the mobile number has fewer than 10 digits.
public class LengthNotSufficientException extends Exception {

    public LengthNotSufficientException(String message) {
        super(message);
    }
}
