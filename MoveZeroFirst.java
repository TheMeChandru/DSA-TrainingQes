public class MoveZeroFirst {
    public static void main(String[] args) {
      int arr[]={1,2,0,0,3};
      int n=arr.length;
      int[] arr2= new int[n];
      int count=0;
       for (int i=0;i<n; i++) {
            if(arr[i]==0){
              arr2[count++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            arr2[count++]=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
          System.out.println(arr2[i]);
        }
    }
}
