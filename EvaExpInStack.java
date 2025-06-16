
import java.util.Stack;

public class EvaExpInStack {
        public static void main(String[] args) {
        String s = "231*+9-";
        int n = s.length();
        Stack<Integer> stack = new Stack<>(); 
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;
                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                }
                stack.push(result);
            }
        }
        int result = stack.pop();
        System.out.println("Result: " + result);

    }
}
