public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10,10,10};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }

        if(arr[n-1]!=arr[n-2]){
        System.out.println("The second larget element is " +arr[n-2]);
        }else{
            System.out.println("There is no second largest element -1");
        }

        // int s1=-1;
        // int s2=-1;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>s1){
        //         s2=s1;
        //         s1=arr[i];
        //     }else if (arr[i]>s2 && arr[i]<s1) {
        //         s2=arr[i];
        //     }

        // }
        // System.out.println(s2);
    }
}
