package collectionspractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinations {
    private static final String[] LETTERS = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> getCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        // An empty input has no letter combinations.
        if (digits.isEmpty()) {
            return combinations;
        }

        addCombinations(digits, 0, new StringBuilder(), combinations);
        return combinations;
    }

    private static void addCombinations(String digits, int index,
            StringBuilder current, List<String> combinations) {
        // Once one letter has been chosen for every digit, save this combination.
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        String letters = LETTERS[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            // Try one letter for this digit, then move on to the next digit.
            current.append(letters.charAt(i));
            addCombinations(digits, index + 1, current, combinations);

            // Remove the last letter to try the next choice for this digit.
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digits from 2 to 9: ");
        String digits = scanner.nextLine();

        try {
            // Only digits 2 through 9 have letters in the phone keypad mapping.
            if (!digits.matches("[2-9]*")) {
                System.out.println("Please enter digits from 2 to 9 only.");
                return;
            }

            // List keeps the combinations in the order they are generated.
            System.out.println(getCombinations(digits));
        } finally {
            scanner.close();
        }
    }
}
