
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MagicalListSort {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5,8,9,3,7,1,3,4,9,3,5,1,8,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,5,7,2));
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for(int i=0;i<list1.size();i++){
            if(list2.contains(list1.get(i))){
                list3.add(list1.get(i));
            }else{
                list4.add(list1.get(i));
            }
        }
        Collections.sort(list3);
        Collections.sort(list4);
        System.out.println(list3);
        System.out.println(list4);
        ArrayList<Integer> mergeList = new ArrayList<>(list3);
        mergeList.addAll(list4);
        System.out.println("The merged list is: "+mergeList);
    }
}
