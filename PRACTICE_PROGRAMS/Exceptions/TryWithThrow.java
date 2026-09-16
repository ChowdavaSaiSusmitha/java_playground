package testexception;

public class TryWithThrow {

	public static void main(String[] args) throws Exception {

		int balance=0;

		try {

			if(balance==0) {

				throw new Exception("Access denied!! no transactions availadle currently");

			}else {

				System.out.println("transaction successfull");

			}

		}catch(Exception e) {

			 System.out.println(e.getMessage());

		}finally {

			System.out.println("balance:" + balance);

		}

		System.out.println("transaction details showed");

	}

}

