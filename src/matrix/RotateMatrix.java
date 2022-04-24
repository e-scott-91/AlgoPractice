package matrix;

public class RotateMatrix {

    public void rotate(int[][] matrix) {

        for (int i = 0; i< matrix.length; i++){
            for (int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[0].length/2; col++){
                int temp = matrix[row][matrix[0].length - 1-col];
                matrix[row][matrix[0].length - 1-col] = matrix[row][col];
                matrix[row][col] = temp;
            }
        }

    }
}
