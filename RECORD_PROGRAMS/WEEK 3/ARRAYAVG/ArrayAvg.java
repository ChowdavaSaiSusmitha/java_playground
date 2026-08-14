package basics;
import java.util.Scanner;
public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int total=0;
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            total=total+arr[i];
        }int avg=total/arr.length;
        for(int x:arr){
            System.out.println(x);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }  
}
