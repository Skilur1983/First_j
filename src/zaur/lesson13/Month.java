package zaur.lesson13;

public class Month {

    public static void main(String[] args) {
        int month = (int) (Math.random()*11+1);

        System.out.println(month);

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month there are 31 days");
                break;
            case 2:
                System.out.println("This month there are 28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month there are 30 days");
                break;
            default:
                System.out.println("Wrong number. Try again");
                break;
        }
    }
}
