import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a floating-point number: ");
        float floatNumber = scanner.nextFloat();
        
        // Implicit casting from float to double
        double doubleNumber = floatNumber;
        System.out.println("Implicitly casted to double: " + doubleNumber);
        
        System.out.print("Enter a double-precision number: ");
        double anotherDouble = scanner.nextDouble();
        
        // Explicit casting from double to int
        int intNumber = (int) anotherDouble;
        System.out.println("Explicitly casted to int: " + intNumber);
        
       
        // charerter to integer
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int charToInt = (int) character;
        System.out.println("Character '" + character + "' to integer: " + charToInt);
        scanner.close();
    }

    }

