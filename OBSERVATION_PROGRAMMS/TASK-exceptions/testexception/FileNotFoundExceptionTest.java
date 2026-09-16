package testexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String file = sc.nextLine();

        try {
            //trying to open file
            FileInputStream fileinput = new FileInputStream(file);
            System.out.println("File opened successfully.");
            //every opened file need to close it after use otherwise it will cause memory leak
            fileinput.close();
        } catch (FileNotFoundException exception) {
            //catch handles when file not found
            System.out.println("File was not found.");
        } catch (IOException exception) {
            //catch handles when any input or output error occurs
            System.out.println("An I/O error occurred while accessing the file.");
        } finally {
            System.out.println("File check completed.");
            sc.close();
        }
    }
}
