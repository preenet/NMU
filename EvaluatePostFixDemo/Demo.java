package EvaluatePostFixDemo;

import java.util.Stack;
public class Demo {
    

    public static int PostFix(String input ) {
        // return the result as interger

        // create a stack using Java API
        Stack<Integer> stack = new Stack<>();
        

        //?? just like in the slide i showed you, we iterate over each charactor of the string


        for (int i =0; i<input.length(); i++) {
            char ch = input.charAt(i); // get a token of char

            // check if it digit or not (1-9.0..)
            if (Character.isDigit(ch)) {
                stack.push(ch-'0'); // convert character to integer and push to the stack
            }
            else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result=0;

                switch(ch) {
                    case '+':
                        result = operand1 + operand2;
                    break;                   
                        case '-':
                        result = operand1 - operand2;
                    case '*':
                    break;
                    // do it yourself
                    case '/':
                    break;
                    // do it yourself
                    default:
                        throw new IllegalArgumentException("Error");   
                 }// end switch
                 stack.push(result);
            }

        }

        return stack.pop();
    }

    public static void main(String args[]) 
    {
        // read the input file (from MSTeam)
        // read until the of file
        // parase each of the dataLine and evaluate it using the method above.
        String input = "52-";

        int result = PostFix(input);
        System.out.println(" the result is: " + result);


    }
}// end class Demo
