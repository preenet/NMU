import java.util.*;

public class InfixToPostfix {
    // Function to check if a character is an operator
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    // Function to compare the precedence of two operators
    private static boolean hasHigherPrecedence(char op1, char op2) {
        Map<Character, Integer> precedence = new HashMap<>();
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);
        precedence.put('^', 3);
        
        return precedence.get(op1) > precedence.get(op2);
    }

    public static String infixToPostfix(String expression) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If the character is a digit, append it to the output
                output.append(ch);
            } else if (isOperator(ch)) {
                // If the character is an operator
                while (!stack.isEmpty() && isOperator(stack.peek()) && hasHigherPrecedence(stack.peek(), ch)) {
                    // Pop operators from the stack and append them to the output
                    output.append(stack.pop());
                }
                // Push the current operator onto the stack
                stack.push(ch);
            } else if (ch == '(') {
                // If the character is an opening parenthesis, push it onto the stack
                stack.push(ch);
            } else if (ch == ')') {
                // If the character is a closing parenthesis
                while (!stack.isEmpty() && stack.peek() != '(') {
                    // Pop operators from the stack and append them to the output
                    output.append(stack.pop());
                }
                // Pop the opening parenthesis from the stack (discard it)
                stack.pop();
            }
        }

        // Append any remaining operators from the stack to the output
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter an infix expression: ");
        String infixExpression = scanner.nextLine();

        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Postfix expression: " + postfixExpression);
    }
}