public class Operators {
    public static void main(String[] args) {

        // ? Example of Arithmetic Operator

        int a = 10, b = 3;

        // Addition
        int sum = a + b;

        // Subtraction
        int diff = a - b;

        // Multiplication
        int mul = a * b;

        // Division
        int div = a / b;

        // Modulus
        int mod = a % b; // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);




        
        // ? Example of Unary Operator

        // Integer declared
        // int a = 10;
        // int b = 10;

        // Using unary operators
        // System.out.println("Postincrement : " + (a++));
        // System.out.println("Preincrement : " + (++a));

        // System.out.println("Postdecrement : " + (b--));
        // System.out.println("Predecrement : " + (--b));

        // * Post-increment (a++) returns the value first, then increments it.
        // * Pre-increment (++a) increments first, then returns the updated value.





        // ? Example of Assignment Operator

        // initial value
        int num = 10;
        System.out.println("Initial: " + num);

        // add 5 → num = num + 5
        num += 5;
        System.out.println("After +5: " + num);

        // multiply by 2 → num = num * 2
        num *= 2;
        System.out.println("After *2: " + num);

        // subtract 5 → num = num - 5
        num -= 5;
        System.out.println("After -5: " + num);

        // divide by 2 → num = num / 2
        num /= 2;
        System.out.println("After /2: " + num);

        // remainder after dividing by 3 → num = num % 3
        num %= 3;
        System.out.println("After %3: " + num);





        // ? Example of Relational Operator
        // ? Comparison operators

        // int a = 10;
        // int b = 3;
        // int c = 5;

        // System.out.println("a > b: " + (a > b));
        // System.out.println("a < b: " + (a < b));
        // System.out.println("a >= b: " + (a >= b));
        // System.out.println("a <= b: " + (a <= b));
        // System.out.println("a == c: " + (a == c));
        // System.out.println("a != c: " + (a != c));




        // ? Example of Logical Operator
        // Logical operators

        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));




        // ? Example of Ternary Operator

        // int a = 20, b = 10, c = 30, result;

        // result holds max of three
        // numbers

        // result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        // System.out.println("Max of three numbers = "+ result);




        // ? Example of Bitwise Operator

        int d = 0b1010;
        int e = 0b1100;

        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));





        // ? Example of instanceof
        String str = "Hello";
        System.out.println(str instanceof String);

        Object obj = 10;
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}
