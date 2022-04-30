package dynamicProgramming;

import java.util.List;

public class MaxLengthConcatStrings {

    public int maxLength(List<String> arr) {
        int[] max = new int[1];

        helper(arr, "", max, 0);

        return max[0];

    }

    public void helper(List<String> arr, String currString, int[] max, int currIndex) {
        if (currIndex == arr.size() && countUniqChars(currString) > max[0]) {
            max[0] = currString.length();
            return;
        }
        if (currIndex == arr.size()) return;

        helper(arr, currString, max, currIndex+1);
        helper(arr, currString + arr.get(currIndex), max, currIndex+1);

    }

    public int countUniqChars(String s) {
        int[] charCount = new int[26];

        for (char c: s.toCharArray()) {
            charCount[c - 'a']++;
            if (charCount[c - 'a'] > 1) {
                return -1;
            }
        }
        return s.length();
    }
}
