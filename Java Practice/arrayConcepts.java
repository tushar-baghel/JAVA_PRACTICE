import java.util.Arrays;
import java.util.Scanner;

public class arrayConcepts {
    public static void main(String[] args) {
        int arr[] = new int[5]; // declaring and size
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt(); // taking input through loop
        }
        System.out.println(Arrays.toString(arr)); // printing an array
    }
    
}
