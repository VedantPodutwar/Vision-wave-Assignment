package array_2d;

// Count the number of even and odd elements present in a 2D array.

public class Task_1 {
	public static void main(String[] args) {
		
		int arr[][] = {{2,2},{1,2},{3,4}};
		
		int even = 0;
		int odd = 0;
		
		for(int r=0;r<arr.length;r++) {
			
			for (int c=0;c<arr.length-1;c++) {
				if(arr[r][c]%2==0) {
					even++;
				}
				else {
					odd++;
				}
				
			}
		}
		
		System.out.println("Number of even"+even);
		System.out.println("Number of odd"+odd);
		
	}

}
