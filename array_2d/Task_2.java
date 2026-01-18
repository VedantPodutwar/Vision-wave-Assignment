package array_2d;

public class Task_2 {
	public static void main(String[] args) {
		
		//Largest element in each row of a matrix
		
				
				int matrix[][] = {
						{3,10,5},
						{7,2,8},
						{4,16,9}
				};
				
				
				int max[] = {matrix[0][0],matrix[1][0],matrix[2][0]};
				
				
				for(int r=0;r<3;r++) {
					
					
					for(int c=0 ; c<3;c++) {
						
					
						if(matrix[r][c]>max[r]) {
							max[r] = matrix[r][c]; 
						}
					}
				}
				
			
				for(int k=0 ; k<max.length;k++) {
					System.out.println(max[k] );
				}
			}
		
	}


