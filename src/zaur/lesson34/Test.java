package zaur.lesson34;

import java.util.ArrayList;
import java.util.function.Predicate;

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

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        Predicate<Integer> p = x -> x % 3 == 0;
        numbers.removeIf(p);
        /* an equivalent of:
        numbers.removeIf(x -> x % 3 ==0); */
        System.out.println(numbers);
        numbers.sort((x, y) -> -x.compareTo(y)); // "-" - sorts in desc
        System.out.println(numbers);
    }
}

interface TestCount {
    int abc(String s1, String s2);
}
