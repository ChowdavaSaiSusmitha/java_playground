package testexception;

import java.util.Scanner;



public class TryException {

	static void Arrays() {

		Scanner sc=new Scanner(System.in);

	    int a[]=new int[5];

	    System.out.println("enter elements in an array:");

	    	for(int i=0;i<5;i++){

	    		a[i]=sc.nextInt();

	    	}

	    	try {
                System.out.println("enter the index of an array element you want to print:");
	    		int k=sc.nextInt();

	    		System.out.println(a[k]);

	    	}catch(ArrayIndexOutOfBoundsException aioob) {

	    		System.out.println("write another index");

	    	}finally {

	    		System.out.println(" elements in an Array");

	    	}

	    	

	    	for(int i=0;i<5;i++){

	            System.out.println( a[i]);

	        }

	    sc.close();

	}

	

	public static void main(String[] args) {

		TryException.Arrays();

	}

}


