package zaur.lesson27;

public interface Swimmable {

    /* starting java 8 interfaces may contain methods with body with modifier "default"
     * Keep in mind that it's not access modifier.
     * For default methods access modifier is always default.
     * Can't be static, final or abstract. */
    default int swimDistance(boolean swimmable, int startSwimming, int finishSwimming) {
        if (swimmable) {
            return finishSwimming - startSwimming;
        } else return 0;
    }
}
