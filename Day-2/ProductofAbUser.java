 import java.util.*;
public class ProductofAbUser {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number (A): ");
        int A = scanner.nextInt();
        
        System.out.print("Enter second number (B): ");
        int B = scanner.nextInt();
        
        int product = A * B;
        System.out.println("The product of A and B is: " + product);
        
        
    }
}
