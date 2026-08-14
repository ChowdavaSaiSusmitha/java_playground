package basics;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        int result=0,original=n;
        while(n!=0){
            int r=n%10;
            n=n/10;
            result=result*10+r;
        }
        System.out.println("Reversed number: " + result);
        int prime=0;
        if(original==result){
            for(int i=2;i<result;i++){
                if(result%i==0){
                    System.out.println("The number is not prime");
                    prime=0;
                    break;
                }prime=1;
            
        }
        if(prime==1){
            System.out.println("The number is prime palindrome");
        }else if(prime==0 && original==result){
            System.out.println("The number is a palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }
    }
}
