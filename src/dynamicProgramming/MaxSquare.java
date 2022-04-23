package dynamicProgramming;

public class MaxSquare {

    public int maximalSquare(char[][] matrix) {
        int maxSoFar = 0;
        int M = matrix.length;
        int N = matrix[0].length;

        int[][] dp = new int[M][N];

        for (int j=0; j<N; j++) {
            dp[M-1][j] = matrix[M-1][j] == '1' ? 1 : 0;
            maxSoFar = Math.max(maxSoFar, dp[M-1][j]);
        }
        for (int i=0; i<M; i++) {
            dp[i][N-1] = matrix[i][N-1] == '1' ? 1 : 0;
            maxSoFar = Math.max(maxSoFar, dp[i][N-1]);
        }

        for (int i=M-2; i>=0; i--) {
            for (int j=N-2; j>=0; j--) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i][j+1],
                            Math.min(dp[i+1][j+1], dp[i+1][j]));
                    maxSoFar = Math.max(maxSoFar, dp[i][j]);
                }
            }
        }

        return maxSoFar * maxSoFar;
    }
}
