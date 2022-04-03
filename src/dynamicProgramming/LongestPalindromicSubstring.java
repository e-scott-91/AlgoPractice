package dynamicProgramming;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }

        // table[i][j] == true <=> s.substring(i, j + 1) is a palindrome
        boolean[][] table = new boolean[length][length];

        // these variables will store the indices of the max palindrome
        int beginIndex = 0;
        int endIndex = 0;

        for (int left = length - 1; left >= 0 ; left--) {
            for (int right = left; right < length; right++) {
                if (s.charAt(left) == s.charAt(right) && (right - left < 3 || table[left + 1][right - 1])) {
                    table[left][right] = true;
                    if (right - left > endIndex - beginIndex - 1) {
                        beginIndex = left;
                        endIndex = right + 1;
                    }
                }
            }
        }

        return s.substring(beginIndex, endIndex);
    }
}
