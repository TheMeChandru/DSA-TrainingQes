import java.util.ArrayList;
import java.util.Collections;
public class MergeTwoList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(0);
        list2.add(6);
        list2.add(7);   
        list2.add(8);

        ArrayList<Integer> mergeList = new ArrayList<>(list1);
            mergeList.addAll(list2);
            Collections.sort(mergeList,Collections.reverseOrder());

            System.out.println("Merged List: " + mergeList);

    }
    
}
