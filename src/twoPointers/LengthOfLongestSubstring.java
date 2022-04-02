package twoPointers;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstringSolution(String s) {
        int n = s.length(), ans = 0;
        Set<Character> set = new HashSet<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n;) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(s.charAt(j));
                ans = Math.max(ans, set.size());
                j++;
            }
        }
        return ans;
    }
}

// abbcdefb
