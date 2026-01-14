package array;
import java.util.Scanner;
//Write a Java program to read N integer elements into an array and print them.



public class NintElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of array");
		
		int n = sc.nextInt();
		int []arr= new int[n];
		
		System.out.print("Array elements : ");
		
		for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
