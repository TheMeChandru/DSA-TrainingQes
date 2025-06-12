public class Kaprekar {
    public static void main(String[] args) {
        int n = 297;
        int square = n * n;
        int t = square;
        int digits = 0;
        while (t > 0) {
            digits++;
            t /= 10;
        }
        int count = 1;
        for (int i = 1; i < digits; i++) {
            count = count * 10;
            int l = square / count;
            int r = square % count;

            if (r > 0 && (l + r == n)) {
               System.out.println("It is a Kaprekar number");
               
            }
        }

    }
    
}
