package zaur.lesson29;

public class MotorCycle implements Vehicle{
    int wheels = 2;

    @Override
    public void move() {
        System.out.println("Riding my bike on " + wheels + " wheels");
    }
}
