package testexception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a and b:");
		
		try {
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int k=a/b;
		  System.out.println(a);
		  System.out.println(k);
		}catch(InputMismatchException ime) {
			System.out.println("enter integer value only");
		}catch(ArithmeticException ae) {
			System.out.println("integer cannot be divided by zero,try again!!!");
		}
		finally {
			System.out.println("program run smoothy without interruptions");
		}
		System.out.println("finally executed program");
		sc.close();
	}
}





