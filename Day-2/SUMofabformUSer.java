import java.util.*;
public class SUMofabformUSer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (A): ");
        int A = scanner.nextInt();

        System.out.print("Enter second number (B): ");
        int B = scanner.nextInt();

        int sum = A + B;
        System.out.println("The sum of A and B is: " + sum);

        scanner.close();
    }
}