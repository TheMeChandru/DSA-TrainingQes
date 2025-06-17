import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ASCCIConversion {
    public static void main(String[] args) {
        String str = "Today is rainy day";
        int[] ascii = new int[str.length()];
        try (FileWriter writer = new FileWriter("ascii.txt")) {
            for (char c : str.toCharArray()) {
                writer.write((int) c + " ");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("ascii.txt"))) {
            String line = reader.readLine();
            StringBuilder sb = new StringBuilder();
            for (String value : line.split(" ")) {
                if (!value.isEmpty()) {
                    sb.append((char) Integer.parseInt(value));
                }
            }

            
            System.out.println("Original string: " + str);
            System.out.println("Converted string: " + sb.toString());
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

    }
}
