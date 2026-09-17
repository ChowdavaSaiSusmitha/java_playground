package number;

import java.util.Scanner;

import static number.Roman.romanToInteger;

public class Roman {

    // Convert the Roman number into an integer.
    public static int romanToInteger(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            throw new IllegalArgumentException("Roman number cannot be empty");
        }

        int result = 0;
        for (int index = 0; index < romanNumber.length(); index++) {
            int currentValue = valueOf(romanNumber.charAt(index));
            // Subtract when a smaller value comes before a bigger value.
            if (index + 1 < romanNumber.length()
                    && currentValue < valueOf(romanNumber.charAt(index + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }

    private static int valueOf(char romanNumber) {
        switch (romanNumber) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman number: " + romanNumber);
        }
    }
}

class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the Roman number from the user.
        System.out.print("Enter a Roman number: ");
        String romanNumber = scanner.nextLine();

        // Call the method from the Roman class.
        int integerValue = romanToInteger(romanNumber);
        System.out.println("Integer value: " + integerValue);

        scanner.close();
    }
}
