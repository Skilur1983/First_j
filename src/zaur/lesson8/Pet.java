package zaur.lesson8;

public class Pet {

    String name;
    int age;
    static int count; // static params are shared by all class instances and can be called without mentioning the class object

    public Pet(String name) {
        this.name = name;
        count++;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
}
