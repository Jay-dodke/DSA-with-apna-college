import java.util.*;

public class UserInput {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Hello, " + name + "! You are " + age + " years old.");

            

    //    for int
        System.out.print("Enter a number: ");
        int Number = scanner.nextInt();
        System.out.println("The number you entered is: " + Number);
   

        // for byte
        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();
        System.out.println("The byte value you entered is: " + byteValue);

        // for double
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("The double value you entered is: " + doubleValue);
        
        // for boolean

        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("The boolean value you entered is: " + booleanValue);

        // for short
        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();
        System.out.println("The short value you entered is: " + shortValue);

        // for long
        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();
        System.out.println("The long value you entered is: " + longValue);
        scanner.close();
    }
}
