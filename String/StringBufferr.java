//? Why do we need StringBuffer?

//* In Java, String objects are immutable.

//* Example using String:

// String str = "Java";
// str.concat(" Programming");
// System.out.println(str);


//* Output:
// Java


//* The original String remains unchanged.


//* Now let's use StringBuffer:

// public class StringBufferr {
//     public static void main(String[] args) {

//         StringBuffer sb = new StringBuffer("Java");

//         sb.append(" Programming");

//         System.out.println(sb);
//     }
// }


//* Output:
// Java Programming


//* Here, append() modifies the existing StringBuffer object.



public class StringBufferr {
    public static void main(String[] args) {

        // 1. append()
        StringBuffer sb1 = new StringBuffer("Java");
        sb1.append(" Programming");
        System.out.println("1. append(): " + sb1);

        // 2. insert()
        StringBuffer sb2 = new StringBuffer("Java");
        sb2.insert(4, " Language");
        System.out.println("2. insert(): " + sb2);

        // 3. replace()
        StringBuffer sb3 = new StringBuffer("Java Programming");
        sb3.replace(0, 4, "Python");
        System.out.println("3. replace(): " + sb3);

        // 4. delete()
        StringBuffer sb4 = new StringBuffer("Java Programming");
        sb4.delete(4, 16);
        System.out.println("4. delete(): " + sb4);

        // 5. deleteCharAt()
        StringBuffer sb5 = new StringBuffer("Java");
        sb5.deleteCharAt(0);
        System.out.println("5. deleteCharAt(): " + sb5);

        // 6. reverse()
        StringBuffer sb6 = new StringBuffer("Java");
        sb6.reverse();
        System.out.println("6. reverse(): " + sb6);

        // 7. charAt()
        StringBuffer sb7 = new StringBuffer("Java");
        System.out.println("7. charAt(): " + sb7.charAt(1));

        // 8. setCharAt()
        StringBuffer sb8 = new StringBuffer("Java");
        sb8.setCharAt(0, 'K');
        System.out.println("8. setCharAt(): " + sb8);

        // 9. length()
        StringBuffer sb9 = new StringBuffer("Java");
        System.out.println("9. length(): " + sb9.length());

        // 10. capacity()
        StringBuffer sb10 = new StringBuffer();
        System.out.println("10. capacity(): " + sb10.capacity());

        // 11. substring()
        StringBuffer sb11 = new StringBuffer("Java Programming");
        System.out.println("11. substring(): " + sb11.substring(0, 4));

        // 12. toString()
        StringBuffer sb12 = new StringBuffer("Java");
        String str = sb12.toString();
        System.out.println("12. toString(): " + str);
    }
}