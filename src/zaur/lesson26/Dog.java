package zaur.lesson26;

public class Dog extends Pet{
    private String master;

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public void protect(){
        System.out.println("I'm protecting " + master);
    }

    @Override
    public void voice(){
        System.out.println(getName() + " barks");
    }

    public static String eat(){ // if it wasn't static it would override the parent method during runtime
        return "Dog eats";
    }

    public void DogEating(){
        System.out.println("Checking if " + eat());
    }
}
