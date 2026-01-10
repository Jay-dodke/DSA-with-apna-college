import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 2;

        while(div < n) {
            if(n % div == 0) {
                System.out.println("Not Prime");
                return;
            }
            div++;
        }

        System.out.println("Prime");
    }
}
