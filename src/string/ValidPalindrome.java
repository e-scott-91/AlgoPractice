package string;

import java.util.Stack;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                char lc = Character.toLowerCase(c);
                stack.push(lc);
            }
        }

        for (char forwards: s.toCharArray()){
            if (Character.isLetterOrDigit(forwards)){
                if (Character.toLowerCase(forwards) != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
