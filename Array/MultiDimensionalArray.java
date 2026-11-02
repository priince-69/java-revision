//? Example of a three-dimensional array:

public class MultiDimensionalArray {
     public static void main(String[] args) {

        int[][][] numbers = {
            {
                {10, 20},
                {30, 40}
            },
            {
                {50, 60},
                {70, 80}
            }
        };

        System.out.println(numbers[0][1][0]);
    }
}
