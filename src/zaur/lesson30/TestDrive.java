package zaur.lesson30;

import java.util.Objects;

public class TestDrive {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V6");
        Car c2 = new Car("black", "V6");
        Car c3 = new Car("red", "V6");
        Object c4 = new Car("red", "V6");

        /* If you don't override equals() it will return false for all cases below
        * Just comment overridden equals() to see this */
        System.out.println(c1.equals(c2)); // false
        System.out.println(c1.equals(c3)); // true
        System.out.println(c2.equals(c3)); // false
        System.out.println(c1.equals(c4)); // true
    }
}

class Car{
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) { // we should use Object as an argument because of case c4
        if (this == o) return true; // checking if this is an object
        if (o == null || getClass() != o.getClass()) return false; // checking for null values
        Car car = (Car) o; // casting object to Car, otherwise we won't be able to compare Car params
        return color.equals(car.color) && engine.equals(car.engine);
    }

    /* If you override equals() via IDE it'll ask you to override hashCode() as well */
    @Override
    public int hashCode() {
        return Objects.hash(color, engine);
    }
}
