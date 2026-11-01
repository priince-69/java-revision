
//? Why Do We Need StringBuilder?

//* In Java, String objects are immutable.

//* Example using String

// String str = "Java";
// str.concat(" Programming");
// System.out.println(str);


//* Output:
// Java


//* The original String remains unchanged because concat() returns a new String.

//* Example using StringBuilder

// StringBuilder sb = new StringBuilder("Java");
// sb.append(" Programming");
// System.out.println(sb);


//* Output:
// Java Programming


//* Here, append() modifies the existing StringBuilder object.
 



//! All StringBuilder Methods in One Java Program

// public class StringBuilderr {
//     public static void main(String[] args) {

//         // 1. append()
//         StringBuilder sb1 = new StringBuilder("Java");
//         sb1.append(" Programming");
//         System.out.println("1. append(): " + sb1);

//         // 2. insert()
//         StringBuilder sb2 = new StringBuilder("Java");
//         sb2.insert(4, " Language");
//         System.out.println("2. insert(): " + sb2);

//         // 3. replace()
//         StringBuilder sb3 = new StringBuilder("Java Programming");
//         sb3.replace(0, 4, "Python");
//         System.out.println("3. replace(): " + sb3);

//         // 4. delete()
//         StringBuilder sb4 = new StringBuilder("Java Programming");
//         sb4.delete(4, 16);
//         System.out.println("4. delete(): " + sb4);

//         // 5. deleteCharAt()
//         StringBuilder sb5 = new StringBuilder("Java");
//         sb5.deleteCharAt(0);
//         System.out.println("5. deleteCharAt(): " + sb5);

//         // 6. reverse()
//         StringBuilder sb6 = new StringBuilder("Java");
//         sb6.reverse();
//         System.out.println("6. reverse(): " + sb6);

//         // 7. charAt()
//         StringBuilder sb7 = new StringBuilder("Java");
//         System.out.println("7. charAt(): " + sb7.charAt(1));

//         // 8. setCharAt()
//         StringBuilder sb8 = new StringBuilder("Java");
//         sb8.setCharAt(0, 'K');
//         System.out.println("8. setCharAt(): " + sb8);

//         // 9. length()
//         StringBuilder sb9 = new StringBuilder("Java");
//         System.out.println("9. length(): " + sb9.length());

//         // 10. capacity()
//         StringBuilder sb10 = new StringBuilder();
//         System.out.println("10. capacity(): " + sb10.capacity());

//         // 11. substring()
//         StringBuilder sb11 = new StringBuilder("Java Programming");
//         System.out.println("11. substring(): " + sb11.substring(0, 4));

//         // 12. toString()
//         StringBuilder sb12 = new StringBuilder("Java");
//         String str = sb12.toString();
//         System.out.println("12. toString(): " + str);
//     }
// }
