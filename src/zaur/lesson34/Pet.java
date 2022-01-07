package zaur.lesson34;

import java.util.ArrayList;

public class Pet {

    String name;
    int age;
    char sex;
    String type;
    double weight;

    public Pet(String name, int age, char sex, String type, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.type = type;
        this.weight = weight;
    }
}

class PetInfo {
    void printPet(Pet p) {
        System.out.println("Pet's name is " + p.name + ".\nIt's a " +
                p.type + ". \nIt's sex is " + p.sex + ". \nIt's " + p.age + " years old. \nIt weights " +
                p.weight + " kilos.");
    }

    void checkPet(ArrayList<Pet> pets, PetCheck check) {
        for (Pet pet : pets) {
            if (check.petCheck(pet)) {
                printPet(pet);
            }
        }
    }
}

interface PetCheck {
    boolean petCheck(Pet p); // to make lambda work this interface must contain only one method
}


