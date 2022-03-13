package twoPointers;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int num[] = new int[nums.length];
        // ensures k isnt't larger than length
        k = k % nums.length;
        // j is pointer for results array
        int j=0;
        // first loop puts the values from end of input array to beginning of new array
        for(int i=nums.length-k;i<nums.length;i++){
            num[j] = nums[i];
            j++;
        }
        // second loop gets the beginning values of input array and adds them after the values from previous loop
        for(int i=0; i<nums.length-k; i++){
            num[j] = nums[i];
            j++;
        }
        // puts new array values into original array
        for(int i=0; i<nums.length; i++){
            nums[i] = num[i];
        }
    }
}
