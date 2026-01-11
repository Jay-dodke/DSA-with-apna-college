import java.util.*;
public class typeConversion {
    public static void main(String[] args) {
        // Implicit Conversion (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Conversion: " + doubleValue);

        // Explicit Conversion (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Conversion: " + anotherIntValue);

        // thoug errors may occur during narrowing conversions
        // For example, when converting a double to an int:
        double doubleValue2 = 9.78;
        int intValue2 = (int) doubleValue2; // This truncates the decimal part
        System.out.println("Truncated value: " + intValue2);


        // lossy conversion
        long longValue = 130;
        byte byteValue = (byte) longValue; // This may cause overflow
        System.out.println("Lossy Conversion: " + byteValue);   
    }
}
