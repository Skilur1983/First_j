package zaur.lesson7.protectedPack;

import zaur.lesson7.Chameleon;

public class HomeChameleon extends Chameleon {

    public String home = "SweetHome";

    public static void main(String[] args) {
        HomeChameleon champ = new HomeChameleon();
        System.out.println("Only friends can see me and we are " + champ.canYouSeeMe + " friends"); // protected parameter is accessible in the very heir
    }
}
