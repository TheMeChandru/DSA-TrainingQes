
import java.util.HashSet;

public class NonRepeatingNo {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        int[] arr= {5,2,4,2,4};
        int res=0;
        for(int i=0;i<arr.length;i++){
            res = res^arr[i];
        }
        System.out.println("Unique Element "+res);
        
    }
    
}
