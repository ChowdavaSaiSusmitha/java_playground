package basics;

import java.util.Scanner;
import java.util.Arrays;

public class StringOperations {
	// This method shows all choices
	static void showMenu() {
		System.out.println("\nChoose a string operation:");
		System.out.println("1. Concatenate using +");
		System.out.println("2. Concatenate using concat()");
		System.out.println("3. Join strings with String.join()");
		System.out.println("4. Compare using equals()");
		System.out.println("5. Compare using equalsIgnoreCase()");
		System.out.println("6. Compare lexicographically using compareTo()");
		System.out.println("7. Check contains()");
		System.out.println("8. Check startsWith()");
		System.out.println("9. Check endsWith()");
		System.out.println("10. Find position using indexOf()");
		System.out.println("11. Replace using replace()");
		System.out.println("12. Join and split strings");
		System.out.println("13. Get substring");
		System.out.println("14. Format strings using String.format()");
		System.out.println("15. Compare == with equals()");
		System.out.println("16. Exit");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Take three strings from the user
		System.out.print("Enter s1: ");
		String s1 = scanner.next();
		System.out.print("Enter s2: ");
		String s2 = scanner.next();
		System.out.print("Enter s3: ");
		String s3 = scanner.next();

		int choice;
		// Show the menu one time
		showMenu();
		do {
			// Take the user's choice
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			// Run the selected operation
			switch (choice) {
				case 1: {
					// Join strings with +
					System.out.println("Using +: " + s1 + " " + s2);
					break;
				}
				case 2: {
					// Join strings with concat()
					System.out.println("Using concat(): " + s1.concat(s2));
					break;
				}
				case 3: {
					// Join three strings
					System.out.println("Joined string: " + String.join(", ", s1, s2, s3));
					break;
				}
				case 4: {
					// Check if strings are the same
					System.out.println("equals(): " + s1.equals(s2));
					break;
				}
				case 5: {
					// Check same letters without case
					System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));
					break;
				}
				case 6: {
					// Compare two strings
					System.out.println("compareTo(): " + s1.compareTo(s2));
					break;
				}
				case 7: {
					// Check if s1 has s2
					System.out.println("Contains s2: " + s1.contains(s2));
					break;
				}
				case 8: {
					// Check the start of s1
					System.out.println("Starts with s2: " + s1.startsWith(s2));
					break;
				}
				case 9: {
					// Check the end of s1
					System.out.println("Ends with s2: " + s1.endsWith(s2));
					break;
				}
				case 10: {
					// Find s2 inside s1
					System.out.println("Index of s2: " + s1.indexOf(s2));
					break;
				}
				case 11: {
					// Replace s1 with s3 in s2
					System.out.println("Replaced string: " + s2.replace(s1, s3));
					break;
				}
				case 12: {
					// Join and split the strings
					String joined = String.join(",", s1, s2, s3);
					System.out.println("Split result: " + Arrays.toString(joined.split(",")));
					break;
				}
				case 13: {
					// Take a part of s1
					System.out.print("Enter start position: ");
					int start = scanner.nextInt();
					System.out.print("Enter end position: ");
					int end = scanner.nextInt();
					System.out.println("Substring: " + s1.substring(start, end));
					break;
				}
				case 14: {
					// Put the strings in one format
					System.out.println("Formatted string: " + String.format("%s-%s-%s", s1, s2, s3));
					break;
				}
				case 15: {
					// Compare object and content
					System.out.println("Using ==: " + (s1 == s2));
					System.out.println("Using equals(): " + s1.equals(s2));
					break;
				}
				case 16:
					// Stop the program
					System.out.println("Program ended.");
					break;
				default:
					System.out.println("Invalid choice.");
			}
			System.out.println();
		} while (choice != 16);

		scanner.close();
	}
}
