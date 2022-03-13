package twoPointers;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int num[] = new int[nums.length];
        k = k % nums.length; int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            num[j] = nums[i];
            j++;
        }
        for(int i=0; i<nums.length-k; i++){
            num[j] = nums[i];
            j++;
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = num[i];
        }
    }
}
