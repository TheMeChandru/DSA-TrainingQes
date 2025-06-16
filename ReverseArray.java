
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<arr.length;i++){
            queue.offer( arr[i] );
        }
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
         while(!stack.isEmpty()){
             System.out.println(stack.pop());
        }
    }
    
}
