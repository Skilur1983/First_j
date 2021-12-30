package zaur.lesson20;

public class Varargs {

    public static void sum(int... a) { // in this case we may use as many arguments as we want
        int sum = 0;

        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sum(String s, int... a) {
        /* methods with varags can be overloaded, but:
        1. there must be only 1 varargs;
        2. varargs must be the last argument;
        3. we can't overload method with an array as varargs is compiled to array.
         */
        int sum = 0;

        for (int i : a) {
            sum += i;
        }
        System.out.print(s);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(0); // 0
        sum(6, 9, 7); // 22
        sum(3, 4, 7, 5, 11); // 30

        sum("Hi, I'm this old: ", 3, 4, 7, 5); // Hi, I'm this old: 19
    }
}
