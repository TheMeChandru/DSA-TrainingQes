import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("Original List: " + list1);
        Collections.reverse(list1);
        System.out.println("first reverse :"+list1);
        ArrayList<Integer> reversedList = new ArrayList<>();
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()){
            int curr = itr.next();
            reversedList.add(0, curr);
        }
        System.out.println("Reversed List: " + reversedList);
        
    }
    
}
