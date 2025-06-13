public class NumberToWords {
    private static final String[] ones = {"", "One", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static void main(String[] args) {
        int n = 123;
        StringBuilder words = new StringBuilder();
        if (n == 0) {
            System.out.println("zero");
            return;
        }
        if (n >= 100) {
            words.append(ones[n / 100]).append(" hundred");
            n %= 100;
            if (n > 0) {
                words.append(" and ");
            }
        }
        if (n >= 20) {
            words.append(tens[n / 10]);
            n %= 10;
            if (n > 0) {
                words.append("-");
            }
        } else if (n >= 10) {
            words.append(teens[n - 10]);
            n = 0;
        }
        if (n > 0) {
            words.append(ones[n]);
        }
        System.out.println(words.toString().trim());
    }
}