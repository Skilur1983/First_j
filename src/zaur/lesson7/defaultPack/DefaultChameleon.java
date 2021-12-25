package zaur.lesson7.defaultPack;

import zaur.lesson7.Chameleon;

public class DefaultChameleon extends Chameleon {

    public static void main(String[] args) {
        DefaultChameleon champ = new DefaultChameleon();
        System.out.println("I'm " + /* champ.age + */ " years old"); // 'age' is default in 'zaur.lesson7.Chameleon'. Cannot be accessed from outside package
    }
}
