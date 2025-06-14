import java.util.ArrayList;
public class ListOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("List elementd "+list1);
        list1.addFirst(5);
        System.out.println("Add first "+list1);
        list1.addLast(50);
        System.out.println(" Add last "+list1);
        list1.add(2,45);
        System.out.println("add at position "+list1);
        list1.remove(2);

        System.out.println(" Remove at position "+list1);

        for(int val : list1){
            System.out.println(val);
        }

        

    
    }
    
}
