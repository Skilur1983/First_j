package zaur.lesson34;

import java.util.ArrayList;

public class PetTest {

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        Pet pet1 = new Pet("Rocky", 5, 'm', "Dog", 17);
        Pet pet2 = new Pet("Leo", 3, 'm', "Cat", 7);
        Pet pet3 = new Pet("Jerry", 2, 'm', "Mouse", 0.2);
        Pet pet4 = new Pet("Lucky", 8, 'f', "Dog", 12);
        Pet pet5 = new Pet("Cleo", 6, 'f', "Cat", 6.7);

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        pets.add(pet5);

        PetInfo info = new PetInfo();

        info.checkPet(pets, (Pet p) -> {
            return p.name.equals("Leo");
        });
        System.out.println("---------------------------");
        info.checkPet(pets, p -> p.age > 4); // if you don't specify incoming param, java will automatically populate it
        System.out.println("---------------------------");
        info.checkPet(pets, p -> {
            return p.sex != 'm';
        }); // you can combine both long and short description
        System.out.println("---------------------------");
        info.checkPet(pets, (Pet p) -> {
            return !p.type.equals("Mouse");
        });
        System.out.println("---------------------------");
        info.checkPet(pets, (Pet p) -> {
            return p.weight > 10;
        });
        System.out.println("---------------------------");
    }
}
