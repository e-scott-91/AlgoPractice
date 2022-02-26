package twoPointers;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int [] result = new int[nums.length];
        int pos=nums.length-1;
        while(left<=right){
            int rightSquare = nums[right]*nums[right];
            int leftSquare = nums[left]*nums[left];
            if(rightSquare>leftSquare){
                result[pos] = rightSquare;
                right--;
            }else{
                result[pos] = leftSquare;
                left++;
            }
            pos--;
        }
        return result;
    }
}
