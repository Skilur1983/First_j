package zaur.lesson27;

public interface Movable {

    /* Interface may have only public or default access modifier
     * Compiler automatically adds abstract to the interface definition
     * Interface can't be final
     * interfaces can't extend or be extended by classes, only interfaces */

    /* Java 9
    * private modifier can be used. They can only be used within an interface */

    /* The variable in an interface is public, static, and final by default.
     * If any variable in an interface is defined without public, final, and static keywords
     * then, the compiler automatically adds the same.
     * No access modifier is allowed except the public for interface variables.
     * Every variable of an interface must be initialized in the interface itself.
     * The class that implements an interface can not modify the interface variable,
     * but it may use as it defined in the interface. */

    int START = 0;

    /* Interface has no constructors as there is no way to create an instance of it */

    /* even if it's not mentioned all methods in interface are created as "public abstract"
     * in implementations they can't reduce access modifier so all of them will be public
     * if they aren't implemented they will be abstract and so the class as well */

    int moveTo(int newFinish);

    static void moveAttitude() { // always public; this method isn't inherited
        System.out.println("I like to move it");
    }
}
