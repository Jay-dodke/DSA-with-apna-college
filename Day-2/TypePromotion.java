public class TypePromotion {
    public static void main(String[] args) {
        // Example of type promotion in arithmetic operations
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;

        // In the following expression, byte and short are promoted to int
        int result = byteValue + shortValue + intValue;
        System.out.println("Result of byte + short + int: " + result);

        // Example with mixed types
        float floatValue = 5.5f;
        double doubleValue = 10.5;

        // In this expression, float is promoted to double
        double mixedResult = floatValue + doubleValue;
        System.out.println("Result of float + double: " + mixedResult);
    }
}
