package InfixToPostFixDemo;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;


public class Main {


    // pre:
    // post:
    private static boolean isOperator(char ch) {
        
        return ch == '+' || ch == '-' || ch == '*' || ch=='/' || ch =='^';

    }// end method isOperator

    // pre:
    // post:
    private static boolean hasHigherPrecedence(char op1, char op2) {

        // the logic here.
        // how are we going to check the piority of op1 and op2
        // given + , - , *....

        Map<Character, Integer> precedence = new HashMap<>();

        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);
        precedence.put('^', 3);

        // then how we can return the true of false for op1 and op2
        return precedence.get(op1) > precedence.get(op2);
    }// end method hasHigherPrecedence


    // pre:
    // post:
    public String infixToPostfix(String expression) {

        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        // iterate over the read string
        for (char ch: expression.toCharArray()) {
            // check for opertor (if it digit or non digit)
            if(Character.isDigit(ch)) {
                output.append(ch);
            }
            else if (isOperator(ch)){
                // if the character is an opeter 
                while(!stack.isEmpty() && isOperator(stack.peek()) && hasHigherPrecedence(stack.peek(), ch)) {
                    // pop operators from the stack and append it

                    output.append(stack.pop());

                } // end while

                // Push the current operator onto the stack
                output.append(stack.pop());

            }// end if 

            // rule number 4 (if the character is an opening parenthesis, we push it into the stack)
            else if (ch == '(') {
                stack.push(ch);
            }
            // rule number 5 ( if the character is a closing parentheis, we are going pop )
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop())
                }
                // pop the opening parenthsis from the stack
                stack.pop();

            }

            // append any remaninding operator from the stack to the output

            while(!stack.isEmpty()) {
                output.append(stack.pop());
            }

            }
            return output.toString();
    
        }// end method infoxToPostFix

        
    public static void main(String args[]) {
       // Scanner scanner = new Scanner(System.in);

        System.out.println("hi");
    }
    
}
