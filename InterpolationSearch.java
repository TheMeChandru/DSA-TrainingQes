public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,70,45,65,35};
        int key =35;
        int pos=0;
        int low = 0;
        int high = arr.length-1;
        while (low <= high && key >= arr[low] && key <= arr[high]) {
            if (low == high) {
                if (arr[low] == key) {
                    System.out.println("Key Found at position " + (low + 1));
                    return;
                }
                System.out.println("Key not found in array");
                return;
            }
            pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            if (arr[pos] == key) {
                System.out.println("Key Found at position " + (pos));
                return;
            }
            if (arr[pos] < key) {
                low = pos + 1;
            } else { 
                high = pos - 1;
            }
        }
        System.out.println("Key not found in array");
   

    }
}
