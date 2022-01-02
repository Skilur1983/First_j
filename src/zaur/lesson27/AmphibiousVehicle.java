package zaur.lesson27;

public class AmphibiousVehicle extends Vehicle implements Swimmable, Movable {

    /* Class may extend only one class but implement many interfaces  */

    int start = 20;
    boolean canSwim;
    int startSwimming;
    int finishSwimming;

    public AmphibiousVehicle(double speed, int time) {
        super(speed, time);
    }

    public AmphibiousVehicle(int finish) {
        super(finish);
    }

    public AmphibiousVehicle(boolean canSwim, int start, int startSwimming, int finishSwimming) {
        this.canSwim = canSwim;
        this.start = start;
        this.startSwimming = startSwimming;
        this.finishSwimming = finishSwimming;
    }

    @Override
    public int moveTo(int newFinish) {
        return newFinish;
    }
}
