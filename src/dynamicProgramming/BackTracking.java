package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    List<List<Integer>> subsets;

    public List<List<Integer>> subsets(int[] nums) {
        subsets = new ArrayList<>();

        backTracker(0, nums, new ArrayList<>());
        return subsets;
    }

    public void backTracker(int index, int[] nums, List<Integer> curr){
        subsets.add(new ArrayList(curr));

        for (int i = index; i < nums.length; i++){
            curr.add(nums[i]);
            backTracker(i+1, nums, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
