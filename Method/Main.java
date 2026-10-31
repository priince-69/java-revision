 
//? Simple Method Example

// public class Main {

//     // Method definition
//     static void greet() {
//         System.out.println("Hello, Welcome to Java!");
//     }

//     public static void main(String[] args) {

//         // Method call
//         greet();
//     }
// }


//? Method with Parameters

// public class Main {

//     static void add(int a, int b) {
//         int sum = a + b;
//         System.out.println("Sum: " + sum);
//     }

//     public static void main(String[] args) {

//         add(10, 20);
//         add(50, 30);
//     }
// }



//? Method with Return Value

// public class Main {

//     static int add(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {

//         int result = add(10, 20);

//         System.out.println("Sum: " + result);
//     }
// }



//? Examples of all four types

// public class Main {

//     // 1. No parameters, no return value
//     static void greet() {
//         System.out.println("Hello Java");
//     }

//     // 2. Parameters, no return value
//     static void display(int age) {
//         System.out.println("Age: " + age);
//     }

//     // 3. No parameters, return value
//     static int getNumber() {
//         return 100;
//     }

//     // 4. Parameters and return value
//     static int multiply(int a, int b) {
//         return a * b;
//     }

//     public static void main(String[] args) {

//         greet();

//         display(22);

//         int number = getNumber();
//         System.out.println("Number: " + number);

//         int result = multiply(5, 4);
//         System.out.println("Multiplication: " + result);
//     }
// }




//? Static Method vs Instance Method

//* Java methods are commonly categorized as static or instance methods.

//* Static Method: Belongs to the class. You can call it without creating an object.

// public class Main {

//     static void show() {
//         System.out.println("Static Method");
//     }

//     public static void main(String[] args) {
//         show();
//     }
// }


//* Instance Method: Belongs to an object. You need to create an object to call it.

public class Main {

    void display() {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.display();
    }
}


//? Output:
// Instance Method