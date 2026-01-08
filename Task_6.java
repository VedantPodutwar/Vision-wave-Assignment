package dailyassignment;
import java.util.Scanner;

public class Task_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("YOUR AGE");
		int age = sc.nextInt();
		
		System.out.println("MONTHLY SALARY");
		double sal = sc.nextDouble();
		
		System.out.println("CREDIT SCORE");
		int sco = sc.nextInt();
		
		if(age>=21) {
			if(sal>=25000) {
				if(sco>=700) {
					System.out.println("LOAN APPROVED");
					
				}
				else {
					System.out.println("LOAN REJECTED");
				}
				
				
			}else {
				System.out.println("LOAN REJECTED");
			}
			
		}else {
			System.out.println("LOAN REJECTED");
		}
		
		
		
	}

}
