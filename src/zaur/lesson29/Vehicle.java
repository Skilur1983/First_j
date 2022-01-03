package zaur.lesson29;

public interface Vehicle {
    default void move(){
        System.out.println("Move it");
    }
}
