package stacks;

import java.util.Stack;

public class ValidParentheses {
    // returns if the input string has correct ordering and combinations
    // of brackets
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                brackets.push(c);
            } else if (c == '}' && !brackets.isEmpty() && brackets.peek()== '{') {
                brackets.pop();
            } else if (c == ')' && !brackets.isEmpty() && brackets.peek()== '(') {
                brackets.pop();
            } else if (c == ']' && !brackets.isEmpty() && brackets.peek()== '[') {
                brackets.pop();
            } else {
                return false;
            }
        }
        return brackets.isEmpty();
    }
}
