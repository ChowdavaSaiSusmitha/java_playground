package beyond;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static String findLongestSubstring(String input) {
        // A HashSet stores the characters in the current window and checks for repeats quickly.
        Set<Character> characters = new HashSet<>();
        int start = 0;
        int longestStart = 0;
        int longestLength = 0;

        for (int end = 0; end < input.length(); end++) {
            char current = input.charAt(end);

            // Move the start forward until the repeated character leaves the window.
            while (characters.contains(current)) {
                characters.remove(input.charAt(start));
                start++;
            }

            characters.add(current);
            int currentLength = end - start + 1;

            // Keep the first substring when multiple substrings have the same length.
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestStart = start;
            }
        }

        return input.substring(longestStart, longestStart + longestLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String longestSubstring = findLongestSubstring(input);
        System.out.println("Length: " + longestSubstring.length());
        System.out.println("Substring: " + longestSubstring);

        scanner.close();
    }
}
