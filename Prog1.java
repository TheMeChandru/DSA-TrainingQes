public class Prog1{

      public int fibo (int n){
        if(n==1){
        return 1;
        }else if(n==2){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int n=10;
        Prog1 m= new Prog1();
        System.out.println("The fibonacci series is " +m.fibo(n));
          
    }
}