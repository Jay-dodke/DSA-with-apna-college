import java.util.*;
public class AreaofCircle {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        Float radius = scanner.nextFloat();
        
        float area = (float) Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        
        
    }
}