public class TypeCasting {
    public static void main(String[] args) {

        int a = 10;
        double b = a;

        System.out.println(b);


    //?  Example 1: Widening Casting --> Converting int into double

        // int myInt = 9;

        // double myDouble = myInt;

        // System.out.println(myInt);
        // System.out.println(myDouble);


     //? Example 1: Narrowing Casting --> Converting double into int

      double myDouble = 9.78;

      int myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);


    }
}