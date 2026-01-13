package dailytask;
import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entry Timeing");
		int time =sc.nextInt();
		
		if(time<=9) {
			
			System.out.println("ALLOWED");
			
		}
		else {
			System.out.println("LATE ENTRY");
		}
		
	}

}
