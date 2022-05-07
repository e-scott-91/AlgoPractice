import dynamicProgramming.DistinctSubsequences;
import dynamicProgramming.JumpGame;
import dynamicProgramming.LengthSubSeq;
import dynamicProgramming.LongestPalindromicSubstring;
import dynamicProgramming.TargetSum;
import twoPointers.PalindromeInt;
import twoPointers.RotateArray;

import java.lang.annotation.Target;

public class AlgorithmPractice {

    public static void main(String[] args) {
//        AddingNumbersList instance = new AddingNumbersList();
//        SearchAndReturnIndex bs = new SearchAndReturnIndex();
//        instance.addTwoNumbers();
//        int[] input = new int[]{-1,2,4,5,7,9,10};
//        bs.search(input, 7);

        int[] array = new int[]{2,3,1,1,4};
        TargetSum tg = new TargetSum();
        tg.findTargetSumWays(array, 5);

//        rotateArray.rotate(array, 2);
//        PalindromeInt palendrome = new PalindromeInt();
//        Boolean result = palendrome.isPalindrome(1231);
//        System.out.println(result);
//        LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();
//        String result1 = palindromicSubstring.longestPalindrome("abcbdeda");
    }


}
