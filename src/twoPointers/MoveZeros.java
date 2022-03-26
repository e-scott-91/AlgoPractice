package twoPointers;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i:nums){
            if(i!=0){
                nums[count]=i;
                count++;
            }
        }
        for(int j=count;j<nums.length;j++){
            nums[j]=0;
        }
    }
}
