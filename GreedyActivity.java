import java.util.Arrays;
public class GreedyActivity {
    public static void main(String[] args) {
        int[] start = {0,3,1,5,5,8};
        int[] end = {6,4,2,9,7,9};
        int n = start.length;
        int[] result = new int[n];
        int count =0;
        // Arrays.sort(start);        Arrays.sort(end);
        for(int i=1;i<n;i++){
            for(int j=0;j<end.length;j++){
                if(end[j] <= start[i]){
                    result[i] = end[j];
                    count++;
                    break;
                    }
            }
        }
        System.out.println(Arrays.toString(result));
        System.out.println(count);
    }


    
}
