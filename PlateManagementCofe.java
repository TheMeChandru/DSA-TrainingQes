
import java.util.Stack;

public class PlateManagementCofe {
    public static void main(String[] args) {
        Stack<Integer> plateStack = new Stack<>();
        int coustomer =1;
       for (int i = 1; i <= 5; i++) { 
            plateStack.push(i);
        }
        while (!plateStack.isEmpty()) {
            if (coustomer == 1) {
                System.out.println("Customer " + coustomer + " takes plate " + plateStack.pop());
                coustomer++;
            } else {
                System.out.println("Customer " + coustomer + " takes plate " + plateStack.pop());
                coustomer = 1;
            }
        }

    }
    
}
