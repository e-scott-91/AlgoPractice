package matrix;

import java.util.ArrayList;

public class SetZeros {

    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> zeroCoordinates = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    zeroCoordinates.add(i);
                    zeroCoordinates.add(j);
                }
            }
        }

        int tracker = 0;
        while(tracker < zeroCoordinates.size()){
            int i = zeroCoordinates.get(tracker);
            int j = zeroCoordinates.get(tracker + 1);
            for(int k=0; k < matrix[i].length; k++){
                matrix[i][k]=0;
            }

            for(int k = 0; k < matrix.length; k++){
                matrix[k][j]=0;
            }
            tracker++;
            tracker++;
        }
    }

}
