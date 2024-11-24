import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        boolean b = sc.nextBoolean();
        char c = sc.next().charAt(0);
        short n = sc.nextShort();
        int num = sc.nextInt();
        long num2 = sc.nextLong();
        float num3 = sc.nextFloat();
        double num4 = sc.nextDouble();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(n);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);


        sc.close(); 
    }
        
    
}
