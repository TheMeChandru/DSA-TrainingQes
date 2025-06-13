public class KLargestElement {
    public static void main(String[] args) {
        int arr[] = {1,6,7,2,0,3,5,10,15,61,34};
        int n=arr.length;
        int k = 3;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        int g = n-k;
        for(int i=n-1;i>=g;i--)
        {
            System.out.println(arr[i]);
        }
    }
    }

