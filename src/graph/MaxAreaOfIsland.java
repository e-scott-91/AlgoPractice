package graph;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i=0; i<=grid.length-1; i++) {
            for (int j=0; j<=grid[0].length-1; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int row, int col) {

        if (row < 0 || row > grid.length || col < 0 || col > grid[0].length || grid[row][col] == 0) {
            return 0;
        }
        int count = 1;

        count += dfs(grid, row+1, col);
        count += dfs(grid, row-1, col);
        count += dfs(grid, row, col+1);
        count += dfs(grid, row, col-1);
        return count;
    }

}
