 public class Main {
    public static void main(String[] args) {

        // 1. For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        // 2. While loop
        System.out.println("While Loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println(j);
            j++;
        }

        // 3. Do-while loop
        System.out.println("Do-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 3);

        // 4. Enhanced for loop
        System.out.println("Enhanced For Loop:");
        int[] numbers = {10, 20, 30};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}