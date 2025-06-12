public class CatalanNo {
    public int catlan(int n){
        if(n<=1)
            return 1;
        int result= 0;
        for(int i=0;i<n;i++){
            result +=catlan(i)*catlan(n-i-1);
        }
        return result;
        
    }
    public static void main(String[] args) {
        int n=10;
        CatalanNo obj = new CatalanNo();
        for(int i=0;i<n;i++){
            System.out.println("The catlan number for "+i+" is "+obj.catlan(i));
        }
    }
}
