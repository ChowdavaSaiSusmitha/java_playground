package testexception;

import java.util.Scanner;

public class InterruptedExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sleep time in milliseconds: ");
        int time = sc.nextInt();

        Thread mainThread = Thread.currentThread();

        Thread interrupter = new Thread(() -> {
            try {
                Thread.sleep(1000);
                mainThread.interrupt();
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        interrupter.start();

        try {
            System.out.println("Main thread sleeping for " + time + " milliseconds...");
            Thread.sleep(time);
            System.out.println("Sleep completed.");
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.out.println("The thread was interrupted.");
        } finally {
            System.out.println("Thread check completed.");
            sc.close();
        }
    }
}
