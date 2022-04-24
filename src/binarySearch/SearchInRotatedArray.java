package binarySearch;

public class SearchInRotatedArray {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length -1;

        while (left < right) {
            int mid = left + (right-left)/2;
            if (nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int lowIndex = left;
        left = 0;
        right = nums.length -1;

        if (target >= nums[lowIndex] && target <= nums[right]) {
            left = lowIndex;
        } else {
            right = lowIndex;
        }

        while (left <= right) {
            int mid = left + (right-left)/2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return -1;
    }

}
