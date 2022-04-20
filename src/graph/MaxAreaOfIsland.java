package graph;

public class MaxAreaOfIsland {

    int maxArea = 0;
    int[][] dir = new int[][]{{0,-1},{0,1},{-1,0},{1,0}};

    public int maxAreaOfIsland(int[][] grid) {
        for (int i=0; i<=grid.length-1; i++) {
            for (int j=0; j<=grid[0].length-1; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j, 0));
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col, int depth) {
        grid[row][col] = 0;
        for (int i=0; i<=dir.length-1; i++) {
            int r = row+dir[i][0];
            int c = col+dir[i][1];
            if(isValid(grid,r,c) && grid[r][c]==1) {
                depth = dfs(grid, r, c, depth);
            }
        }
        return depth+1;
    }

    private boolean isValid(int[][] grid, int row, int col) {
        if (row<0 || col<0 || row>grid.length-1 || col>grid[0].length-1) {
            return false;
        }
        return true;
    }
}
