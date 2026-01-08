package dailyassignment;
import java.util.Scanner;

public class Task_5 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER THE SALARY");
		int sal=sc.nextInt();
		
		System.out.println("ENTER EXPERIENCE");
		int exp=sc.nextInt();
		
		if(sal>=30000 && exp >= 3) {
			System.out.println("BONUS ELIGIBLE");
			
		}
		else {
			System.out.println("NOT ELIGIBLE");
		}
	}

}
