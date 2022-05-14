public class Permutations {

    public void nextPermutation(int[] nums) {
        if (nums.length == 1)
            return;
        int indx1 = -1;
        int indx2 = -1;
        for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i] < nums[i+1]){
                indx1 = i;
                break;
            }
        }
        // This is the situation of descending order.
        if (indx1 == -1) {
            reverse(nums, 0, nums.length-1);
        } else {
            // otherwise find the lowest significance entry higher than indx1
            for(int i = nums.length-1; i >= 0; i--) {
                if(nums[i] > nums[indx1]){
                    indx2 = i;
                    break;
                }
            }
            //swap the values so increase permutation
            int temp = nums[indx1];
            nums[indx1] = nums[indx2];
            nums[indx2] = temp;

            // make th
            reverse(nums, indx1+1, nums.length - 1);
        }

    }

    public void reverse(int[] a, int start, int end) {
        while (start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
