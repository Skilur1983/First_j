package zaur.lesson6;

public class Car {

    String engine;
    String color;
    int HP;
    int age;
    String owner;
    int maxSpeed;

    void toStringCar() {
        System.out.println(engine + ", " + color + ", " + HP + ", " + age + ", " + owner + ", " + maxSpeed);
    }

    Car(String engineNew, String colorNew){
        engine = engineNew;
        color = colorNew;
    }

    Car(String ownerNew, int ageNew, String engineNew, String colorNew){
        this(engineNew, colorNew); // One is unable to call different constructor by name, but they can do it by using "this". "this" must be 1st line of the constructor
        owner = ownerNew;
        age = ageNew;
    }

    Car(String ownerNew, int ageNew, String engineNew, String colorNew, int maxSpeedNew){
        this(ownerNew, ageNew, engineNew, colorNew); // java understands what constructor to use in each case
        maxSpeed = maxSpeedNew;
    }

    public Car(String engineNew, String colorNew, int HPNew, int ageNew, String ownerNew, int maxSpeedNew) {
        this(ownerNew, ageNew, engineNew, colorNew, maxSpeedNew);
        HP = HPNew;
    }

}
