
import java.util.LinkedList;
import java.util.Queue;

public class BitConversion {
    public static void main(String[] args) {
        int n = 5;
        String binaryString ="";
        Queue<String> queue = new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.offer(Integer.toBinaryString(i));
        }
        while(!queue.isEmpty()){
            binaryString =queue.poll();
            System.out.print(binaryString+" ");
        }
        System.out.print(binaryString+" ");
            
        
    }
}
