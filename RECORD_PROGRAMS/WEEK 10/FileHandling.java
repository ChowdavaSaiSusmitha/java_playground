package beyond;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Locale;

public class FileHandling {

    public static int countOccurrences(String text, String pattern) {
        String lowerText = text.toLowerCase(Locale.ROOT);
        String lowerPattern = pattern.toLowerCase(Locale.ROOT);
        int count = 0;
        int index = 0;

        // Move past each full match so every occurrence is counted once.
        while ((index = lowerText.indexOf(lowerPattern, index)) != -1) {
            count++;
            index += lowerPattern.length();
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        // Resolve the package's sample file from the project root before using it.
        Path file = Path.of("src", "beyond", "sample.txt").toAbsolutePath().normalize();
        String firstLines = String.join(System.lineSeparator(),
                "Peter Piper picked a peck of pickled peppers",
                "A peck of pickled peppers Peter Piper picked",
                "If Peter Piper picked a peck of pickled peppers");
        String finalLine = "Where’s the peck of pickled peppers Peter Piper picked?";

        // Write mode replaces any old contents so repeated runs stay consistent.
        Files.writeString(file, firstLines, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        // Append the final line to demonstrate append mode without changing the sample text.
        Files.writeString(file, System.lineSeparator() + finalLine, StandardCharsets.UTF_8,
                StandardOpenOption.APPEND);

        // Read mode loads the completed file for pattern counting.
        String fileContents = Files.readString(file, StandardCharsets.UTF_8);

        System.out.println("'pe' - no of occurrences - "
                + countOccurrences(fileContents, "pe"));
        System.out.println("'pi' - no of occurrences - "
                + countOccurrences(fileContents, "pi"));
    }
}
