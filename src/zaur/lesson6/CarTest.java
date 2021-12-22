package zaur.lesson6;

public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("V6", "green");
        Car car2 = new Car("Boris", 6, "V8", "red");
        Car car3 = new Car("Sonya", 7, "Gas", "white", 180);
        Car car4 = new Car("Petrol", "white", 115, 5, "Phil", 230);

        car1.toStringCar();
        car2.toStringCar();
        car3.toStringCar();
        car4.toStringCar();
    }
}
