package dynamicProgramming;

import java.util.HashMap;

public class CanPartition {

    public boolean canPartition(int[] nums) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        if (total % 2 != 0) {
            return false;
        }

        int goal = total/2;

        return helper(goal, 0, nums, new HashMap<String, Boolean>());

    }

    public boolean helper(int goal, int index, int[] nums, HashMap<String, Boolean> cache) {
        if (index == nums.length || goal < 0) return false;

        if (goal == 0) return true;
        String curr = goal + "-" + index;

        if (cache.containsKey(curr)) return cache.get(curr);

        boolean res = helper(goal- nums[index], index+1, nums, cache) || helper(goal, index+1, nums, cache);

        cache.put(curr, res);
        return res;
    }
}
