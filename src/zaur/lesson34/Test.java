package zaur.lesson34;

public class Test {
    static void def(TestCount count) {
        System.out.println(count.abc("Hello", "Bye"));
    }

    public static void main(String[] args) {
        def((x, y) -> {
            y.length();
            return x.length();
        });
        /* one can use several params and
         * several params update in method,
         * but there should be only one return statement */
    }
}

interface TestCount {
    int abc(String s1, String s2);
}
