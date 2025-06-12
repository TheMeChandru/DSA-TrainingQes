public class ArrayEquilibriam {
    public static void main(String[] args) {
        int[] arr={3,4,3,1,6};
        int n= arr.length;
        int totalSum=0;
         int currentSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        for(int i=0;i<n;i++){
            totalSum = totalSum-arr[i];
            if(currentSum == totalSum){
                System.out.println("The equilibriam index value of an array is "+i);
            }else{
                currentSum+=arr[i];
            }
            
        }
    }
}
