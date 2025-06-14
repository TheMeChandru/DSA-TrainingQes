public class TwoNonRepeatingEle {
    public static void main(String[] args) {
         int[] arr = {5, 2, 4, 2, 4, 6};
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        int rightmostSetBit = xor & -xor;
   
       int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rightmostSetBit) != 0) {
                res[0] ^= arr[i];
            } else {
                res[1] ^= arr[i];
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
