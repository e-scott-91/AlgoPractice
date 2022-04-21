package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {
        //set boundary condition
        int l = 0, up = 0, down = matrix.length-1, r = matrix[0].length-1;
        int size = (down+1)*(r+1), j = 0;
        List<Integer> ans = new ArrayList<>();
        while(j<size){
            //**** checking j<size in all iteration****
            // forward(left to right) travel in a row
            for(int i=l; i<=r && j<size; i++){         ans.add(matrix[up][i]);    j++;}
            //forward(up to down) travel in a column
            for(int i=up+1; i<=down && j<size; i++){   ans.add(matrix[i][r]);     j++;}
            //backward(right to left) travel in a row
            for(int i=r-1; i>=l && j<size; i--){       ans.add(matrix[down][i]);  j++;}
            //backward(down to up) travel in a column
            for(int i=down-1; i>=up+1 && j<size; i--){ ans.add(matrix[i][l]);     j++;}
            // set(reduce) new boundary condition
            l++;    r--;    up++;   down--;
        }
        return ans;
    }
}
