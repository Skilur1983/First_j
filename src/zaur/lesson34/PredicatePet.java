package zaur.lesson34;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicatePet {

    String name;
    int age;
    char sex;
    String type;
    double weight;

    public PredicatePet(String name, int age, char sex, String type, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.type = type;
        this.weight = weight;
    }
}

class PredicatePetInfo {
    void printPet(PredicatePet p) {
        System.out.println("Pet's name is " + p.name + ".\nIt's a " +
                p.type + ". \nIt's sex is " + p.sex + ". \nIt's " + p.age + " years old. \nIt weights " +
                p.weight + " kilos.");
    }

    void checkPet(ArrayList<PredicatePet> pPets, Predicate<PredicatePet> check) {
        for (PredicatePet pPet : pPets) {
            if (check.test(pPet)) {
                printPet(pPet);
            }
        }
    }

}