package dailytask;
import java.util.Scanner;

public class Task_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER BILLING UNIT");
		int U= sc.nextInt();
		
		if (U<=100) {
			System.out.println(U*5);
		}
		else if(U>100 && U<=200) {
			System.out.println(U*7);
		}
		else {
			System.out.println(U*10);
		}
		
	}
	
	
	
	

}
