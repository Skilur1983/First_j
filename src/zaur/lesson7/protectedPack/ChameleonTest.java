package zaur.lesson7.protectedPack;

public class ChameleonTest {

    public static void main(String[] args) {
        HomeChameleon champy = new HomeChameleon();

        System.out.println(champy.home);
        System.out.println("Only friends can see me and we are " + /* champy.canYouSeeMe + */ " friends"); // but protected parameters are inaccessible in instances
        champy.introduction();
    }
}
