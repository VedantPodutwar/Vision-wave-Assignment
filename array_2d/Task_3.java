package array_2d;

public class Task_3 {

	public static void main(String[] args) {
		// Print element of the matrix in spiral order
		
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int top = 0;
        int bottom = 2;
        int left = 0;
        int right = 2;

        System.out.println("Spiral order : ");

        while (top <= bottom && left <= right) {


            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;


            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

    
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println();

	}

}
