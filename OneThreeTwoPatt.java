
import java.util.Stack;

public class OneThreeTwoPatt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {5,6,7,8};
        int n = arr.length;
        int s3 =0;
       for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                s3 = arr[stack.pop()];
            }
            if (s3 > arr[i]) {
                System.out.println("The array has a 132 pattern");
                return;
            }
            stack.push(i);
        }
        System.out.println("The array does not have a 132 pattern");
     }
    
}
