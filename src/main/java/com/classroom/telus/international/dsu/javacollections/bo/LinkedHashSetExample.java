package com.classroom.telus.international.dsu.javacollections.bo;

import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.*;

/**
 *
 * @author geovanni.santos
 */
public class LinkedHashSetExample implements AnimalInterface {

    static LinkedHashSet<Animal> animalLinkedHashSet = new LinkedHashSet<>();

    @Override
    public void createAnimal(Animal animal) {
        animalLinkedHashSet.add(animal);
        System.out.println("created successfully");
    }

    @Override
    public Object readAllAnimal() {
        String result = "";
        for (Animal s : animalLinkedHashSet) {
            result = result + "*" + s.getName() + "\n";

        }
        return result;
    }

    @Override
    public void updateAnimal(Animal aold, Animal anew) {
        if (animalLinkedHashSet.contains(aold)) {
            animalLinkedHashSet.remove(aold);
            animalLinkedHashSet.add(anew);
            System.out.println("updated successfully");
        } else {
            System.out.println("The animal does not exist in the registry");
        }
    }

    @Override
    public void deleteAnimal(Animal animal) {
        if (animalLinkedHashSet.contains(animal)) {
            animalLinkedHashSet.remove(animal);

            System.out.println("removed successfull");
        } else {
            System.out.println("The animal does not exist in the registry");
        }
    }

}
