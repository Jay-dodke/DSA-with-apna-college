import java.util.*;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1, sum = 0;

        while(val <= n) {
            sum += val;
            val++;
        }

        System.out.println(sum);
    }
}
