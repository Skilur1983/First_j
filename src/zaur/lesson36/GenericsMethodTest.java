package zaur.lesson36;

import java.util.ArrayList;

public class GenericsMethodTest {

    public static void main(String[] args) {
        GenericsMethod method = new GenericsMethod();

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(6);
        integers.add(3);
        integers.add(5);
        integers.add(1);
        integers.add(4);
        integers.add(7);
        System.out.println(method.getSecondElement(integers));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("2+");
        strings.add("6+");
        strings.add("3+");
        strings.add("5+");
        strings.add("1+");
        strings.add("4+");
        strings.add("7+");
        System.out.println(method.getSecondElement(strings));
    }
}

class GenericsMethod {

    public <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}