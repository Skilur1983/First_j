package zaur.lesson26;

public class Pet {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public final void sleep(){ // in case method is set final it's impossible to override it
        System.out.println("Sleeping");
    }

    public void voice(){
        System.out.println(getName() + " makes a sound");
    }

    public static String eat(){ // static methods a called Compile time
        return "Pet eats";
    }

    public void PetEating() {
        System.out.println("Checking if " + eat());
    }
}
