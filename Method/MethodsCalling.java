//? Calling Different Types of Methods

//* Method calling in Java means invoking a method to execute the code it contains. It transfers control to the process, runs its logic, and then returns to the calling point after execution.


//? 1. Calling a User-Defined Method

//* User-defined methods are blocks of code written by the programmer. To execute a user-defined method, we first create an object of the class (if the method is non-static) and then call the method using that object.



// class MethodsCalling {
//     void hello() {
//         System.out.println("This is a user-defined method.");
//     }

//     public static void main(String[] args) {
//         MethodsCalling obj = new MethodsCalling(); // Create object
//         obj.hello();             // Call method
//     }
// }

//* Output
// This is a user-defined method.


//* */ Explanation: In the above code a class Geeks with a method hello() that displays a message. In the main() method, we create an object of the class and use it to call the hello() method.





//? 2. Calling an Abstract Method

//* Abstract methods have no body and must be overridden in a subclass. They are called using an object of the subclass.



// abstract class GeeksHelp {
//     abstract void check(String name); // Abstract method
// }

// public class  MethodsCalling extends GeeksHelp {
//     @Override
//     void check(String name) {
//         System.out.println(name);
//     }

//     public static void main(String[] args) {
//         MethodsCalling obj = new MethodsCalling(); // Subclass object
//         obj.check("GeeksforGeeks");
//     }
// }


//* Output
// GeeksforGeeks


//* Explanation: In the above code an abstract class GeeksHelp with an abstract method check(), which is implemented in the subclass Geeks. In the main() method, an object of Geeks is created to call the implemented check() method.





//? 3. Calling the Predefined Methods

//* Java provides many built-in methods via the Java Standard Library, like hashCode().


// public class MethodsCalling {
//     public static void main(String[] args) {
//         MethodsCalling obj = new MethodsCalling();
//         System.out.println(obj.hashCode()); // Predefined method
//     }
// }

//* Output
// 2060468723


//* Explanation: In the above code an object of the Geeks class and calls the predefined hashCode() method.

//* hashCode() returns an integer hash code for the object. This value is used in hash-based collections like HashMap and HashSet. It is not guaranteed to be unique or represent the memory address.




//? 4. Calling a Static Method

//* Static methods belong to the class, not the object. They can be called without creating an object.



// class Test {
//     static void hello() {
//         System.out.println("Hello");
//     }
// }
// public class MethodsCalling {
//     public static void main(String[] args) {
//         Test.hello(); // Call static method directly
//     }
// }


//* Output
// Hello


//* Explanation: we call a static method hello() from the test class without creating an instance of the class. The method prints "Hello" when invoked from the main method.
