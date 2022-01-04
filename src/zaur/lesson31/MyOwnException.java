package zaur.lesson31;

public class MyOwnException {
    void numberCheck(int number) throws WrongNumberException {
        if (number > 12){
            throw new WrongNumberException("Number is too high " + number);
        }
    }

    public static void main(String[] args) {
        MyOwnException my = new MyOwnException();
        try {
            my.numberCheck(14);
        } catch (WrongNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

class WrongNumberException extends Exception { // this is a way to create your own exceptions

    WrongNumberException(String message){
        super(message);
    }
}
