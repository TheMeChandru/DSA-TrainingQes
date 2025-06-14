public class CountPairs {
    public static void main(String[] args) {
        int[] arr= {5,15,25,35,45};
        int n = arr.length;
        int count=0;
        int x=200;
        int y=2000;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               String result = ""+arr[i]+arr[j];
            //    System.out.println(result);
               if (x<= Integer.parseInt(result)  && Integer.parseInt(result) <= y) {
                count++;
               }
            }
        }
        System.out.println(count);

    }
}
