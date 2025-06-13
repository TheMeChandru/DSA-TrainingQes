public class MaxSum {
    public static void main(String[] args) {
      int[] arr={1,2,3,-2,5};
      int n= arr.length;
      int maxSum=arr[0];
      int currSum=arr[0];
      for(int i=1;i<n;i++){
        currSum=Math.max(arr[i],currSum+arr[i]);
        maxSum=Math.max(maxSum,currSum);
      }
      System.out.println("Maximum sum is "+maxSum);

    }
    
}
