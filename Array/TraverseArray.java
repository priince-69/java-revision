//? Traverse Array

//* */ Traversing an array means accessing each element one by one. In Java, arrays can be easily traversed using a loop where the loop variable runs from 0 to array.length - 1.

public class TraverseArray {
    //   public static void main(String[] args){
        
    //     int[] arr = {2, 4, 8, 12, 16};

    //     // Traversing and printing array
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }


    //* Using Enhanced for loop
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
//* Difference: A normal for loop gives you access to the index. An enhanced for loop directly gives you each element.