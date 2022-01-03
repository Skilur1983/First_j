package zaur.lesson29;

public class TestDrive {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new MotorCycle();
        Vehicle v3 = new Van();

        v1.move(); // dynamic binding during runtime
        v2.move();
        v3.move();
        System.out.println("--------------");
        Vehicle[] vehicles = {v1, v2, v3}; // one can put instances in an array

        for(Vehicle v:vehicles){
            if(v instanceof Car){
                Car c = (Car) v; // casting it to Car
                System.out.println("I have " + c.wheels + " wheels"); // as Vehicle has no info about number of wheels
            } else if(v instanceof MotorCycle){
                MotorCycle m = (MotorCycle) v; // casting it to MotoCycle
                System.out.println("I have " + m.wheels + " wheels");
            } else if(v instanceof Van){
                Van van = (Van) v; // casting it to Van
                // System.out.println("I have " + van.wheels + " wheels"); - as number of wheels isn't mentioned we're unable to get it
            } else v.move();
        }
    }
}
