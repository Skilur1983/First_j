package zaur.lesson27;

public class TestDrive {

    public static void main(String[] args) {

        /* one can use either parent class or interface for class creation */

        Vehicle v1 = new Car(56, 3);
        Movable m1 = new Car(45, 7);
        System.out.println(v1.finish); // 5, as v1 was created as a Vehicle it's static bound (compile binding) to value in Vehicle class
        /* private, final and static methods and variables use static binding and are bonded by compiler
         * while virtual methods are bonded during runtime based upon runtime object. */
        System.out.println(m1.START);
        System.out.println(v1.START);
        Movable.moveAttitude(); // Interface static methods can be called only through interface name, not by its implementation

        /* Static binding uses Type (class in Java) information for binding
        while dynamic binding uses object to resolve binding. */

        v1.moveTo(50);
        /* as there is no implementation of the "moveTo" in Vehicle, it uses the Car implementation
         * so instead of static (compile binding) it used dynamic binding (run-time)
         * overridden methods are bonded using dynamic binding at runtime. */
        System.out.println(v1.finish); // 50

        System.out.println(v1.distance(5, 6)); // due to static binding unable to use Car's methods, only those in Vehicle
        // System.out.println(m1.distance); - same with interfaces

        AmphibiousVehicle av1 = new AmphibiousVehicle(true, 15, 25, 55);
        /* interface default methods can be used via its implementations */
        System.out.println(av1.swimDistance(av1.canSwim, av1.startSwimming, av1.finishSwimming));

    }
}
