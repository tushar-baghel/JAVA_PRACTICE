import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedClass {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        String input = bf.readLine();

        System.out.println(input);
        
    }
    
}
