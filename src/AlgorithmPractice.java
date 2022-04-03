import dynamicProgramming.LongestPalindromicSubstring;
import twoPointers.PalindromeInt;
import twoPointers.RotateArray;

public class AlgorithmPractice {

    public static void main(String[] args) {
//        AddingNumbersList instance = new AddingNumbersList();
//        SearchAndReturnIndex bs = new SearchAndReturnIndex();
//        instance.addTwoNumbers();
//        int[] input = new int[]{-1,2,4,5,7,9,10};
//        bs.search(input, 7);
        RotateArray rotateArray = new RotateArray();
        int[] array = new int[]{1,5,6,7,8,9};
        rotateArray.rotate(array, 2);
        PalindromeInt palendrome = new PalindromeInt();
        Boolean result = palendrome.isPalindrome(1231);
        System.out.println(result);
        LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();
        String result1 = palindromicSubstring.longestPalindrome("abcbdeda");
    }


}
