package dynamicProgramming;

public class DistinctSubsequences {

    int[][] dp;

    public int numDistinct(String s, String t) {
        dp = new int[1005][1005];
        for(int i = 0; i < 1005; i++) {
            for(int j = 0; j < 1005; j++) {
                // read information from somewhere
                dp[i][j] = -1;
            }
        }
        return helper(0,0,s,t);

    }

    public int helper(int i, int j, String s, String t) {

        int n = s.length();
        int m = t.length();

        if (j == m) return 1;
        if (i == n) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int total = 0;

        if (s.charAt(i) == t.charAt(j)) {
            total = helper(i+1, j+1, s, t) + helper(i+1, j, s, t);
        } else {
            total = helper(i+1, j, s,t);
        }
        dp[i][j] = total;

        return dp[i][j];
    }
}
