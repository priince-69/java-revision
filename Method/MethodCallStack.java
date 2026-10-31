//! Method Call Stack in Java

//? The call stack is a runtime structure used by the JVM to manage method calls. It follows the Last-In-First-Out (LIFO) principle, where the most recently called method completes first.

//? When a method is called:

//* A stack frame is created for the method call.
//* The method executes its statements.
//* When the method finishes, its stack frame is removed and control returns to the calling method.


//? Methods Execution

// When a method is called:

//* A new stack frame is added to the call stack to store method details.

//* The method runs its code.

//* After execution, the stack frame is removed, and control goes back to the calling method.


//? Java automatically manages the call stack using the Java Virtual Machine (JVM).

public class MethodCallStack {
     public static void D() {
        float d = 40.5f;
        System.out.println("In Method D");
    }

    public static void C() {
        double c = 30.5;
        System.out.println("In Method C");
    }

    public static void B() {
        int b = 20;
        C(); // Calling C
        System.out.println("In Method B");
    }

    public static void A() {
        int a = 10;
        B(); // Calling B
        System.out.println("In Method A");
    }

    public static void main(String[] args) {
        A(); // Start with function A
        D(); // Then call D
    }
}
