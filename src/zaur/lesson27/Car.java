package zaur.lesson27;

public class Car extends Vehicle {

    int start = 10;
    double speed = 50;
    int time = 20;

    /* if abstract class contains constructors, subclass must have an implementation for at least one of them
    but if you want to add your own constructor in subclass you must have its implementation in parent class too */

    public Car(double speed, int time) {
        super(speed, time);
    }

    /* subclass must implement abstract methods of the superclass.
    Otherwise, it must be abstract too. */

    @Override
    public int moveTo(int newFinish) {
        this.finish = newFinish;
        return this.finish;
    }

    int distance(int start, double speed, int time) { // Not only abstract methods can be overridden.
        return (int) (Math.round(speed * time)) - start;
    }
}
