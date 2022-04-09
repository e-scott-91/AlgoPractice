package dynamicProgramming;

public class ClimbStairs {

    public int climbStairs(int n) {
        int[] resultSet = new int[n+1];
        resultSet[0] = 1;
        resultSet[1] = 1;
        for (int i=2; i<=n; i++){
            resultSet[i] = resultSet[i-1] + resultSet[i-2];
        }
        return resultSet[n];
    }

}
