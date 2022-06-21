package arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Simple solution merge all the elements and sort them.
        for(int i = 0; i<nums2.length; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
