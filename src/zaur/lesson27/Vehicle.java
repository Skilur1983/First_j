package zaur.lesson27;

public abstract class Vehicle implements Movable {
    /* abstract classes can extend ordinary classes and other abstract classes
     * if abstract class doesn't introduce any abstract method but implements interface and
     * doesn't override one or several methods from the interface it implements it must be abstract too */

    int finish = 5; // abstract class may contain parameters. But they can't be abstract
    double speed;
    int time;

    /* to be able to implement constructors with different set of parameters
     * we should have default constructor in parent class
     * or use one of the existing with "this(...)"*/
    protected Vehicle() {
    }

    public Vehicle(double speed, int time) {
        this.speed = speed;
        this.time = time;
    }

    public Vehicle(int finish) {
        this.finish = finish;
    }

    public abstract int moveTo(int newFinish); // if class contains abstract method then it should be abstract

    double speedUp(double increaseSpeedBy) { // all other methods may be implemented
        return this.speed + increaseSpeedBy;
    }

    int distance(double speed, int time) {
        return (int) (Math.round(speed * time));
    }
}
