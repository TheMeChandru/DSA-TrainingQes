public class SlidingWindow {
    public static void main(String[] args) {
      int arr[]={3,8,2,5,7,6,12};
      int n=arr.length;
      int sum =0;
      int max=0;
      int k=2;
      int count=0;
      if(n<k){
        System.out.println("The n is less than k"+k);
        return;
      }
      int eind=0;
      for(int i=0;i<k;i++){
          count++;
         eind=count;
        sum += arr[i];
      }
      if(sum>max){
          max=sum;
        }
       for (int i = k; i<n; i++) {
          sum+=arr[i]-arr[i-k];
            if(sum>max){
              max=sum;
              count++;
            }
            eind=count-1;
            
        }
        System.out.println(max);
        System.out.println(eind-2);
        System.out.println(eind);

    }
}
