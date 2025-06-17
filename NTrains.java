public class NTrains {
    public static void main(String[] args) {
        int[] a ={900,940,950,1100,1500,1800};
        int[] d ={910,1200,1120,1130,1900,2000};
        int n= a.length;
        int m = d.length;
        int platform =0;
        int maxPlatform =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]<=d[j]){
                    platform++;
                    i++;
                }else{
                    platform--;
                    j++;
                }
                maxPlatform = Math.max(platform, maxPlatform);
            }
        }
        System.out.println(maxPlatform);
    }
    
}
