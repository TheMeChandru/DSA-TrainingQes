public class LCM {
     static int gcd(int a, int b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
    
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
    
    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("LCM of " + a + " and " + b +" is " + lcm(a,b));
    }

    
}
