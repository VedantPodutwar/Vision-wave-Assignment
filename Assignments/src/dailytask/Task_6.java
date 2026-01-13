package dailytask;
import java.util.Scanner;


public class Task_6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter score :");
		int score = sc.nextInt();
		
		if(score>=75) {
			System.out.println("EXCELLENT");
		}
		else if(score>50 && score < 75) {
			System.out.println("GOOD");
		}
		else {
			System.out.println("NEED IMPROVEMENT");
		}
	}

}
