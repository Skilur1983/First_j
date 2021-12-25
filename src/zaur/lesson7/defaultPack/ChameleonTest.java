package zaur.lesson7.defaultPack;

public class ChameleonTest {

    public static void main(String[] args) {
        zaur.lesson7.Chameleon chameleon = new zaur.lesson7.Chameleon(); // class instance can be created either via import or applying full name
        DefaultChameleon chammy = new DefaultChameleon();

        System.out.println("I'm " + /* chammy.age + */ " years old"); // as DefaultChameleon is in the same package, we're able to get value of the parameter with default modifier
        System.out.println("I'm " + /* chameleon.age + */ " years old"); // 'age' is not public in 'zaur.lesson7.Chameleon'. Cannot be accessed from outside package. Uncomment to see the error
        chameleon.introduction();
        chammy.introduction();
    }
}
