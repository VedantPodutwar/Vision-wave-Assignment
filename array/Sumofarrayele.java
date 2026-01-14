package array;
import java.util.Scanner;
//Write a program to calculate the sum of all elements in an array.


public class Sumofarrayele {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();       
	        int[] arr = new int[n];
	        int sum = 0;

	        // Read array elements
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            sum += arr[i];        
	        }

	        System.out.println("Sum = " + sum);

	     }

}
