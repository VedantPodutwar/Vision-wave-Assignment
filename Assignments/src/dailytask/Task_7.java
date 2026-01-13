package dailytask;
import java.util.Scanner;

public class Task_7 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("ENTER BALANCE");

	        int balance = sc.nextInt();
	        
	        System.out.println("WITHDRAW");
	        int withdraw = sc.nextInt();

	        if (withdraw % 100 != 0) {
	            System.out.println("INVALID AMOUNT");
	        } 
	        else if (balance < withdraw) {
	            System.out.println("INSUFFICIENT BALANCE");
	        } 
	        else {
	            System.out.println("WITHDRAWAL SUCCESSFUL");
	        }

	    
	    }
	

}
