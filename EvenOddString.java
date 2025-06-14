public class EvenOddString {
    public static void main(String[] args) {
         String numStr = "10"; 
        int num = Integer.parseInt(numStr);
        String[] check = {"even", "odd"};
        String result = check[num & 1];
        System.out.println(numStr + " is " + result);
    }
}
