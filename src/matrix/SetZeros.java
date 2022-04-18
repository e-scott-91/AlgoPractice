package matrix;

import java.util.ArrayList;

public class SetZeros {

    public void setZeroes(int[][] matrix) {
        int[] cols = new int[matrix[0].length];
        int[] rows = new int[matrix.length];

        for (int i = 0; i< matrix.length; i++){
            for (int j =0; j< matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    cols[j] = 1;
                    rows[i] = 1;
                }
            }
        }

        for (int i = 0; i< matrix.length; i++){
            for (int j =0; j< matrix[0].length; j++){
                if (rows[i] == 1 || cols[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
