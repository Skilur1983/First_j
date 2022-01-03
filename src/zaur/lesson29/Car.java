package zaur.lesson29;

public class Car implements Vehicle{
    int wheels = 4;

    @Override
    public void move() {
        System.out.println("Moving in a car on " + wheels + " wheels");
    }
}
