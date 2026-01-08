package dailyassignment;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount");
		double balance = sc.nextDouble();
		
		if(balance>= 1000) {
			System.out.println("BALANCE OK");
			
		}
		else {
			System.out.println("LOW BALANCE");
		}
		
		
		
	}

}
