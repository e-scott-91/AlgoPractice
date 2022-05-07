package dynamicProgramming;

public class JumpGame {

//    public boolean canJump(int[] nums) {
//        boolean[] dp = new boolean[nums.length];
//
//        dp[0] = true;
//
//        for (int i = 0; i< nums.length; i++) {
//            for (int j = 1; j <= nums[i]; j++) {
//                if ((i+j) < dp.length && dp[i] && dp[i+j]){
//                    dp[i+j] = true;
//                }
//            }
//        }
//        return dp[nums.length -1];
//    }

    public boolean canJump(int[] nums) {
        boolean[] tracker = new boolean[nums.length];

        tracker[0] = true;

        for (int i = 0; i < nums.length; i++) {
            if (tracker[i] == true) {
                for (int j=i; j <= i+nums[i]; j++) {
                    if (j < nums.length -1) {
                        tracker[j] = true;
                    }
                }
            }
        }
        return tracker[nums.length-1];
    }
}
