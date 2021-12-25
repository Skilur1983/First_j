package zaur.lesson7.privatePack;

import zaur.lesson7.Chameleon;

public class ChameleonTest {

    public static void main(String[] args) {
        Chameleon chameleon = new Chameleon();

        System.out.println("My motto is: " + "\"" + /* chameleon.motto + */ "\""); // as a private parameter it's unreachable anywhere except very class and its methods
        chameleon.introduction();
    }
}
