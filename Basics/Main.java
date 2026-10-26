//* First Program

// public class Main {
//     public static void main (String args[]){
//         System.out.println("Hello hai ji ");
//         System.out.println(3 * 3);
//     }
// }



//?  Types of Comments in Java

//* 1. Single-Line Comment (//)
//* 2. Multi-Line Comment (/* ... */)
//* 3. Documentation Comment (/** ... */)

//! Example:
/**
 * This class demonstrates documentation comments.
 */
public class Main {

    /**
     * Prints a greeting message.
     * @param name the name of the person
     */
    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        greet("Prince");
    }
}