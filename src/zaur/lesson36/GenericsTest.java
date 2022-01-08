package zaur.lesson36;

public class GenericsTest {

    public static void main(String[] args) {
        Info <String> string = new Info<>("Hi");
        System.out.println(string);
        Info <Integer> integer = new Info<>(100);
        System.out.println(integer);
        int i = integer.getValue();
        System.out.println(i);
    }

}

class Info<T>{

    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{value = " + value +'}';
    }

    public T getValue(){
        return value;
    }
}