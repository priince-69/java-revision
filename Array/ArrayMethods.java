import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] numbers = {50, 20, 40, 10, 30};

        // 1. length
        System.out.println("Length: " + numbers.length);

        // 2. sort()
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // 3. toString()
        System.out.println("Array: " + Arrays.toString(numbers));

        // 4. equals()
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("Equals: " + Arrays.equals(numbers, arr2));

        // 5. copyOf()
        int[] copy = Arrays.copyOf(numbers, 3);
        System.out.println("Copied: " + Arrays.toString(copy));

        // 6. binarySearch()
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index);

        // 7. fill()
        int[] arr3 = new int[5];
        Arrays.fill(arr3, 100);
        System.out.println("Filled: " + Arrays.toString(arr3));
    }
}
