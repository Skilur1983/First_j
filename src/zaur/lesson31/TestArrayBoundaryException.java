package zaur.lesson31;

public class TestArrayBoundaryException {
    public static void main(String[] args) {

        int[] ints = {3, 5, 8, 2};

        try{
            System.out.println(ints[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no such element. \nArray contains of " + ints.length + " elements. \nPlease try again.");
        } finally {
            System.out.println("Have a nice day");
        }
    }
}
