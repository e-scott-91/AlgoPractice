package twoPointers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new LinkedList();

        for (int i=0; i< nums.length-2; i++){
            if (i==0 || i > 0 && nums[i] != nums[i-1]){
                int left = i+1;
                int right = nums.length - 1;
                while (left<right) {
                    int target = 0 - nums[i];
                    if (nums[left] + nums[right] == target) {
                        output.add(Arrays.asList(nums[i],nums[left], nums[right]));
                        while (left<right && nums[left] == nums[left +1]) left++;
                        while (right > left && nums[right] == nums[right -1]) right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > target) {
                        right--;
                    } else if (nums[left] + nums[right] < target) {
                        left ++;
                    }
                }
            }
        }
        return output;
    }
}
