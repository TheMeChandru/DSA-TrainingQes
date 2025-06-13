public class TripletCount {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int count =0;
        int sum =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 sum = arr[i] + arr[j]; 
                for(int k=0;k<n;k++){
                    if(arr[k]==sum){
                        count++;
                    }
                }
            }
        }
        System.out.println("Total triplets values are: "+count);
    }
}
