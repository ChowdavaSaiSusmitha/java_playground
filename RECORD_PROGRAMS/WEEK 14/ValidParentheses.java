package collectionspractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ValidParentheses {

    public static boolean isValid(String input) {
        // ArrayDeque works as a stack: the last bracket opened must close first (LIFO).
        // A queue checks brackets in arrival order, so it cannot validate nested brackets.
        Deque<Character> openingBrackets = new ArrayDeque<>();

        for (char bracket : input.toCharArray()) {
            // Ignore spaces so inputs such as "( )" are accepted as shown in the sample.
            if (Character.isWhitespace(bracket)) {
                continue;
            }

            if (bracket == '(' || bracket == '{' || bracket == '[') {
                openingBrackets.push(bracket);
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (openingBrackets.isEmpty()) {
                    return false;
                }

                char openingBracket = openingBrackets.pop();
                if ((bracket == ')' && openingBracket != '(')
                        || (bracket == '}' && openingBracket != '{')
                        || (bracket == ']' && openingBracket != '[')) {
                    return false;
                }
            }
            // Other characters are ordinary text, so they do not affect bracket matching.
        }

        // Any bracket left in the stack was opened but never closed.
        return openingBrackets.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brackets: ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("valid");
        } else {
            System.out.println("Not valid");
        }

        scanner.close();
    }
}
