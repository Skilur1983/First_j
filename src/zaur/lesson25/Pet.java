package zaur.lesson25;

public class Pet {

    String name;
    String petType;

    public Pet(String name, String petType) {
        this.name = name;
        this.petType = petType;
    }

    public Pet(String name) {
        this.name = name;
    }
}

class Dog extends Pet{

    public Dog(String name) { // have to add constructor as there is no default constructor in superclass
        super(name);
    }

    public Dog(){
        super("Pluto"); // we can implement default constructor, but it must call one of the superclass's constructors
    }
}
