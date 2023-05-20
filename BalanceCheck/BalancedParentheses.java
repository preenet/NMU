package BalanceCheck;

import java.util.Stack;

public class BalancedParentheses {
    
    public static boolean isBalanced(String str) {
        // 1. Initialize an empty stack.

        Stack<Character> stack = new Stack<>();


        // 2. Iterate through each character in the string.
        for (char ch : str.toCharArray()) {
            // 3.If the character is an opening symbol (i.e., '{', '[', or '('), push it onto the stack.
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);

            } 
            // 4. If the character is a closing symbol (i.e., '}', ']', or ')'), check if the stack is empty.

            else if (ch == '}' || ch == ']' || ch == ')') {
                // If the stack is empty, it means there is no corresponding opening symbol for the current closing symbol, so the string is unbalanced. Return false.
                if (stack.isEmpty()) {
                    return false; // Unbalanced: closing symbol without a corresponding opening symbol
                }
                // If the stack is not empty, pop the top element from the stack.
                char top = stack.pop();

                if ((ch == '}' && top != '{') ||
                    (ch == ']' && top != '[') ||
                    (ch == ')' && top != '(')) {
                    return false; // Unbalanced: mismatched opening and closing symbols
                }
            }
        }
        //5. After iterating through all the characters in the string, check if the stack is empty.
        return stack.isEmpty(); // Balanced if stack is empty
    }

    public static void main(String[] args) {
        String str1 = "{[()]}";
        System.out.println(str1 + " is balanced: " + isBalanced(str1));

        String str2 = "{[()]}]";
        System.out.println(str2 + " is balanced: " + isBalanced(str2));
    }
}