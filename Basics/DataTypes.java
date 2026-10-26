
public class DataTypes {
    public static void main(String[] args) {
        
        // 1. byte
        byte age = 20;

        // 2. short
        short salary = 30000;

        // 3. int
        int population = 100000;

        // 4. long
        long phoneNumber = 9876543210L;

        // 5. float
        float price = 99.99f;

        // 6. double
        double percentage = 89.5678;

        // 7. char
        char grade = 'A';

        // 8. boolean
        boolean isPassed = true;

        // 9. String (Non-primitive)
        String name = "Rahul";

        // 10. Array (Non-primitive)
        int[] marks = {85, 90, 95};

        // Printing all values
        System.out.println("byte: " + age);
        System.out.println("short: " + salary);
        System.out.println("int: " + population);
        System.out.println("long: " + phoneNumber);
        System.out.println("float: " + price);
        System.out.println("double: " + percentage);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isPassed);
        System.out.println("String: " + name);
        System.out.println("Array: " + java.util.Arrays.toString(marks));
    }
}
