import java.util.Scanner;

public class decreasingStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1 ; i <= n ; i++){
            
            for(int j = 0 ; j < n-i+1 ; j++){

                System.out.print("* "); 
                                
            }
            
            System.out.println();
        }
    }
    
}
