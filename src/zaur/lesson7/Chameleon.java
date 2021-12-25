package zaur.lesson7;

public class Chameleon {

    public String name = "Charming"; // accessible allover the project
    protected boolean canYouSeeMe = true; // accessible only in this package and by heirs
    private String motto = "You won't know it"; // accessible only in this class
    int age = 5; // accessible only in this package

    public void introduction(){
        System.out.println("My name is " + name);
        System.out.println("Only friends can see me and we are " + canYouSeeMe + " friends");
        System.out.println("My motto is: " + "\"" + motto + "\"");
        System.out.println("I'm " + age + " years old");
        // via this method we'll be able to get all class data regardless of its location
    }
}
