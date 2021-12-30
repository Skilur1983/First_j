package zaur.lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAndIterator {

    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        List<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s2);
        list1.add(s1);
        list1.add(s4);

        Iterator <String> it = list1.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
