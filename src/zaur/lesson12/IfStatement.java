package zaur.lesson12;

public class IfStatement {

    public static void main(String[] args) {

        if (3 < 5) ; // pay attention to the semicolon at the end of the "if" statement
        System.out.println("It doesn't matter"); // this line doesn't relate to the if-statement

        if (3 < 5)
            System.out.println("It matters"); // this line does relate to the if-statement

        String result = (5 > 3) ? "It's true" : "It's false"; // ternary operator. Works with variables
        System.out.println(result);
    }
}
