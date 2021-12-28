package zaur.lesson16;

public class StringPool {

    // https://www.baeldung.com/java-string-pool

    static void compareStrings(String a, String b) {
        boolean compare = a == b;
        System.out.println(compare);
    }

    static void compareStringValues(String a, String b) {
        boolean compare = a.equals(b);
        System.out.println(compare);
    }

    public static void main(String[] args) {
        String a = "String";
        String b = "String"; // b references to a literal from the pool. No additional memory is used
        String c = new String("String"); // new object is created and additional memory is used
        String d = new String("String");

        compareStrings(a, b);
        compareStrings(a, c);
        compareStrings(b, c);
        compareStrings(c, d); // false due to different memory addresses

        // values are completely the same
        compareStringValues(a, b);
        compareStringValues(a, c);
        compareStringValues(b, c);
        compareStringValues(c, d);
    }
}
