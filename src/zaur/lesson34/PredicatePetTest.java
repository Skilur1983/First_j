package zaur.lesson34;

import java.util.ArrayList;

public class PredicatePetTest {

    public static void main(String[] args) {
        ArrayList<PredicatePet> pPets = new ArrayList<>();
        PredicatePet pet1 = new PredicatePet("Cocky", 4, 'f', "Dog", 13);
        PredicatePet pet2 = new PredicatePet("Teo", 3, 'm', "Mouse", 6);
        PredicatePet pet3 = new PredicatePet("Jim", 2, 'm', "Mouse", 0.15);
        PredicatePet pet4 = new PredicatePet("Bia", 7, 'f', "Dog", 11);
        PredicatePet pet5 = new PredicatePet("Pronto", 6, 'm', "Cat", 7.6);

        pPets.add(pet1);
        pPets.add(pet2);
        pPets.add(pet3);
        pPets.add(pet4);
        pPets.add(pet5);

        PredicatePetInfo info = new PredicatePetInfo();

        info.checkPet(pPets, (PredicatePet p) -> {
            return p.name.equals("Leo");
        });
        System.out.println("---------------------------");
        info.checkPet(pPets, p -> p.age > 4);
        System.out.println("---------------------------");
        info.checkPet(pPets, p -> {
            return p.sex != 'm';
        });
        System.out.println("---------------------------");
        info.checkPet(pPets, (PredicatePet p) -> {
            return !p.type.equals("Mouse");
        });
        System.out.println("---------------------------");
        info.checkPet(pPets, (PredicatePet p) -> {
            return p.weight > 10;
        });
        System.out.println("---------------------------");
    }
}
