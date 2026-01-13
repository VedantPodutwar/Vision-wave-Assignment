package dailytask;

import java.util.Scanner;

public class Task_4 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entry PASSWORD LENGTH");
		int len =sc.nextInt();
		
		if(len>=8) {
			
			System.out.println("STRONG PASSWORD");
			
		}
		else {
			System.out.println("WEAK PASSWORD");
		}
		
	}


}
