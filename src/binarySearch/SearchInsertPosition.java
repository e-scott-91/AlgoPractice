package binarySearch;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]>=target){
                return 0;
            } else {
                return 1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target || nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
    public int searchInsert2(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

}
