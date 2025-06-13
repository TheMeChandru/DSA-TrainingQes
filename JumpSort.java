public class JumpSort {
    public static int jumpSearch(int[] arr,int x){
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev =0;
        while(prev <n && arr[Math.min(step,n)-1]<x){
            prev = step;
            step+=(int) Math.sqrt(n);
        }
        
        for(int i=prev;i<Math.min(step,n); i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={2,3,5,6,7,9,2};
        int x=7;
        int result = jumpSearch(arr, x);
        System.out.println("Key value fount at index " + result);
    }
}
