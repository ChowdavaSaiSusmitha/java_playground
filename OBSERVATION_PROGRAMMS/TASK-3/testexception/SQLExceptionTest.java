package testexception;

import java.sql.SQLException;
import java.util.Scanner;

public class SQLExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a query name: ");
        String query = sc.nextLine();

        try {
            executeQuery(query);
        } catch (SQLException exception) {
            //catch handles database problem
            System.out.println("Database error: " + exception.getMessage());
        } finally {
            System.out.println("Database check completed.");
            sc.close();
        }
    }

    private static void executeQuery(String query) throws SQLException {
        if (query.isEmpty()) {
            //empty query causes sql exception
            throw new SQLException("The query name is empty.");
        }
        System.out.println("Query received: " + query);
    }
}
