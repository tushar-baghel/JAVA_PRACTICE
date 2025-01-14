jiimport java.util.Arrays;
import java.util.Scanner;

public class arrayConcepts {
    public static void main(String[] args) {
        int arr[] = new int[5]; // declaring and size
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt(); // taking input through loop
        }
        System.out.println(Arrays.toString(arr)); // printing an array
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]); // traversing each element of the array
        }
        // 2d Array
        int arr2[][] = new int[3][3]; // initialising 2d Array
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                arr2 [i][j] = sc.nextInt(); // taking input in 2d array
            }
        }
        
        


    }
    
}
