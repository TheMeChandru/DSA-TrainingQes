public class Ladder {
    public static void main(String[] args) {
        int n=10;
        int third=0;
        if(n==1){
            System.err.println("1");
        }
        int a= 1;
        int b=2;
        for(int i=3;i<=n;i++){
            third=a+b;
            a=b;
            b=third;
            System.out.println("The series ladder at "+ i +" is "+b);
        }
    }
}
