
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotateListByK {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int k = 2;
        Collections.rotate(list, k);
        System.out.println("The rotated list is: " + list);
        k = k % list.size();
        int n = list.size();

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = n - k; i < n; i++) {
            temp.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            list.remove(list.size() - 1);
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            list.add(0, temp.get(i));
        }
        System.out.println("The rotated list is: " + list);
        
    }
    
}
