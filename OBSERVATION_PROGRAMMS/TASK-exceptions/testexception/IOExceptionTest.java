package testexception;
import java.io.IOException;
import java.util.Scanner;

public class IOExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data to read: ");
        String data = sc.nextLine();

        try {
            readData(data);
        } catch (IOException exception) {
            //catch handles input output problem
            System.out.println("Input/output error: " + exception.getMessage());
        } finally {
            System.out.println("Input/output check completed.");
            sc.close();
        }
    }

    private static void readData(String data) throws IOException {
        if (data.isEmpty()) {
            //empty data causes input output exception
            throw new IOException("No data was entered.");
        }
        System.out.println("Data: " + data);
    }
}
