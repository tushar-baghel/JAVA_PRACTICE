import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%n == 0 && n%1 == 0){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
        

    
    }
    
}
