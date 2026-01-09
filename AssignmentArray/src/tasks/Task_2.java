package tasks;

public class Task_2 {
	public static void main(String[] args) {
	// Sum of Array Elements
	
			int arr[] = {23,32,45,89,56,44,34,34};
			
			int total=0;
			
			for(int i=0;i<arr.length;i++) {
				total += arr[i];
			}
			
			System.out.println("Sum of all Elements : "+total);

		}

}
