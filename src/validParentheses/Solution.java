package validParentheses;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */

public class Solution {

    public boolean validParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "()";
        System.out.println(solution.validParentheses(input1));
        String input2 = "()[]{}";
        System.out.println(solution.validParentheses(input2));
        String input3 = "(]";
        System.out.println(solution.validParentheses(input3));
        String input4 = "([])";
        System.out.println(solution.validParentheses(input4));
        String input5 = "([)]";
        System.out.println(solution.validParentheses(input5));
    }
}
