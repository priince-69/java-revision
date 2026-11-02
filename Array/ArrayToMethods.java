//? Passing Arrays to Methods

//* Like variables, we can also pass arrays to methods. For example, the below program passes the array to method sum to calculate the sum of the array's values.


public class ArrayToMethods {
    
     public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
        sum(arr);
    }

    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
}
