//? What is intern() in Java?

//* The intern() method returns the canonical pooled String for a given String value.

public class Main {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = new String("Java");

        String s3 = s2.intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}

//* Output:
// false
// true


//* Why?
// - s2 refers to a separate String object.
// - intern() returns the pooled reference for "Java".
// - Therefore, s1 and s3 refer to the same pooled object.


