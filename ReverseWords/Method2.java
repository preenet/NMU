package ReverseWords;

import java.util.Stack;

public class Method2 {
    public static String reverseWords(String input) {
        String[] words = input.split("\\s+");
        Stack<String> stack = new Stack<>();
        
        for (String word : words) {
            stack.push(word);
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World! This is a test.";
        String reversedWords = reverseWords(input);
        System.out.println(reversedWords); // Output: test. a is This World! Hello
    }
}




