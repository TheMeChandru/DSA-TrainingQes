public class TCSQues {
    public static void main(String[] args) {
      int arr[]={1,1,0,0,1,0,0,1,0,0,1,0,1,0};
      int n=arr.length;
      int left= 0;
      int right=n-1;
      int temp=0;
      //   int count=0;
    //    for (int i=0;i<n; i++) {
    //         if(arr[i]==0){
    //           arr2[count++]=arr[i];
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==1){
    //         arr2[count++]=arr[i];
    //         }
    //     }
        
    //     for(int i=0;i<n;i++){
    //       System.out.print(arr2[i]);
    //     }

    for(int i=0;i<n;i++){
        if(arr[left]==1 && arr[right]==0){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right--;
        }
        else if(arr[left]==0){
            left++;
        }else if(arr[right]==1){
            right--;
        }

    }
    for(int i=0;i<n;i++){
    System.out.println(arr[i]);
    }
}
}
