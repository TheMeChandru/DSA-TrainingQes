
import java.util.Arrays;

public class RatAndHole {
    public static void main(String[] args) {
        int[] m={4,-4,2};
        int[] h={4,0,5};
        Arrays.sort(m);
        Arrays.sort(h);
        int max_t =0;
        for(int i=0;i<m.length;i++){
            max_t = Math.max(max_t,Math.abs(m[i]-h[i]));
        }
        System.out.println(max_t);

    }
    
}
