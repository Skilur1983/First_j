package zaur.lesson26;

public class DogTest {

    public static void main(String[] args) {

        Pet butch = new Dog();

        butch.setName("Butch");
        butch.setAge(3);

        butch.sleep();
        butch.voice(); // as a Pet what voice will produce Butch?
        // butch.protect(); - nevertheless Butch uses Dog methods, it was created as a Pet and Pet has no method "protect"
        // butch.setMaster("Paul"); - either I'm unable to set master as it's Dog's parameter

        Dog andy = new Dog();

        andy.setName("Andy");
        andy.setAge(4);
        andy.setMaster("Cleo"); // as Andy was created as a Dog we're able to set its master

        andy.voice();
        andy.protect(); // and we're able to use its specific method
    }
}
