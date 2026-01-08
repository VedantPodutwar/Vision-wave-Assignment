package dailyassignment;
import java.util.Scanner;

public class Task_4 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("BILLING UNIT");
		int unit= sc.nextInt();
		
		if (unit<=100) {
			System.out.println("LOW USAGE");
			
		}
			else if(unit >100 && unit<=300) {
			System.out.println("MEDIUM USAGE");
		}
			
		
		else {
			System.out.println("HIGH USAGE");
		}
		
		
	}

}
