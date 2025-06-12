public class SquareUseBinary {
    public static void main(String[] args) {
        int l=1;
        int x=64;
        int end=x;
        int ans=0;
            
            while(l<=end){
                int mid =(l+end)/2;
                if(mid * mid==x){
                    System.out.println("The square root of "+x+" is "+mid);
                    break;
                }else if(mid<=x/mid){
                    l=mid+1;
                    ans = mid;
                }else{
                    end=mid-1;
                }
            }
            
    }
}
