
import java.util.Stack;

public class PalindromeStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String s= "MADAM";
        int n = s.length();
        String rev ="";
        for (int i = 0; i < n; i++) {
            stack.push(String.valueOf(s.charAt(i)));
        }
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                System.out.println("The Stack is empty");
                break;
            } else {
                rev = stack.pop() + rev;
            }
        }
        if (s.equalsIgnoreCase(rev)) {
            System.out.println("The String is a Palindrome");
        } else {
            System.out.println("The String is not a Palindrome");
        }
        
    }
    
}
