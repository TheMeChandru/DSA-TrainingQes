
import java.util.Arrays;

public class Notes {
    public static void main(String[] args) {
        int n = 104;
        int[] notes = {1,2,5,10,50,100,500};
        Arrays.sort(notes);
        int count =0;
        for(int i=notes.length-1;i>=0;i--){
            if(notes[i]>n){
                continue;
            }else{
                int m = n/notes[i];
                n-= m * notes[i];
                count+=m;
            }
        }
        System.out.println(count);
    }
}
