public class StringMethods {
     public static void main(String[] args) {

        // 1. length()
        String str1 = "Java";
        System.out.println("1. length(): " + str1.length());

        // 2. charAt()
        String str2 = "Java";
        System.out.println("2. charAt(0): " + str2.charAt(0));
        System.out.println("   charAt(2): " + str2.charAt(2));

        // 3. toUpperCase()
        String str3 = "java";
        System.out.println("3. toUpperCase(): " + str3.toUpperCase());

        // 4. toLowerCase()
        String str4 = "JAVA";
        System.out.println("4. toLowerCase(): " + str4.toLowerCase());

        // 5. equals()
        String str5a = "Java";
        String str5b = "Java";
        System.out.println("5. equals(): " + str5a.equals(str5b));

        // 6. equalsIgnoreCase()
        String str6a = "Java";
        String str6b = "JAVA";
        System.out.println("6. equalsIgnoreCase(): " +
                str6a.equalsIgnoreCase(str6b));

        // 7. contains()
        String str7 = "Welcome to Java";
        System.out.println("7. contains(): " + str7.contains("Java"));

        // 8. substring()
        String str8 = "Programming";
        System.out.println("8. substring(): " + str8.substring(0, 7));

        // 9. replace()
        String str9 = "I like Java";
        System.out.println("9. replace(): " +
                str9.replace("Java", "Python"));

        // 10. trim()
        String str10 = "  Java  ";
        System.out.println("10. trim(): '" + str10.trim() + "'");

        // 11. startsWith()
        String str11 = "Java Programming";
        System.out.println("11. startsWith(): " +
                str11.startsWith("Java"));

        // 12. endsWith()
        String str12 = "Java Programming";
        System.out.println("12. endsWith(): " +
                str12.endsWith("Programming"));

        // 13. indexOf()
        String str13 = "Java Programming";
        System.out.println("13. indexOf('a'): " + str13.indexOf('a'));
        System.out.println("    indexOf(\"Program\"): " +
                str13.indexOf("Program"));

        // 14. isEmpty()
        String str14 = "";
        System.out.println("14. isEmpty(): " + str14.isEmpty());

        // 15. split()
        String str15 = "Java,Python,C++";
        String[] languages = str15.split(",");

        System.out.println("15. split():");
        for (String language : languages) {
            System.out.println("    " + language);
        }
    }
}
