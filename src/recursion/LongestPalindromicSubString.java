package recursion;

public class LongestPalindromicSubString {
    private int n;

    public String longestPalindrome(String s) {
        this.n = s.length();

        String res = "";

        for(int i = 0; i < n; i++) {
            String s1 = helper(s, i, i);
            String s2 = helper(s, i, i + 1);

            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }

        return res;
    }

    private String helper(String s, int l, int r) {
        while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return s.substring(l + 1, r);
    }
}
