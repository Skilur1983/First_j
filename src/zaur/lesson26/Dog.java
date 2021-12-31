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

    public void voice(){
        System.out.println(getName() + " barks");
    }
}
