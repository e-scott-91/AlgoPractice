package graph;

public class NumIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i=0; i < grid.length; i++){
            for (int j=0; j < grid[0].length; j++){
                if (grid[i][j]== '1') {
                    dfsSearcher(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfsSearcher(char[][] grid, int row, int col){
        // Conditions
        if (row < 0 || col < 0 || row > grid.length -1 || col > grid[0].length -1){
            return;
        }
        else if (grid[row][col] == '0') {
            return;
        }

        // process cell
        grid[row][col] = '0';

        // call dfs as needed
        dfsSearcher(grid, row+1, col);
        dfsSearcher(grid, row-1, col);
        dfsSearcher(grid, row, col + 1);
        dfsSearcher(grid, row, col -1);
    }
}
