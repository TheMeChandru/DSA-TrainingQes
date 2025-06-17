public class LargestPossibleNo {
    public static void main(String[] args) {
    int[] arr ={3,30,34,5,9};
    int n = arr.length;
    String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((strArr[i] + strArr[j]).compareTo(strArr[j] + strArr[i]) < 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
        String result = "";
        for (String s : strArr) {
            result += s;
        }
        System.out.println(result);
}
    
}
