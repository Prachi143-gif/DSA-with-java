
public class MatrixAddition {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        
        // Create a result matrix
        int[][] result = new int[rows][cols];
        
        // Add the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Display the result
        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
