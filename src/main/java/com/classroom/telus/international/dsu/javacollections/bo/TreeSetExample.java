package com.classroom.telus.international.dsu.javacollections.bo;

import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.*;

/**
 *
 * @author geovanni.santos
 */
public class TreeSetExample implements AnimalInterface {

    static NavigableSet<Animal> animalTreeSet = new TreeSet<>();

    @Override
    public void createAnimal(Animal animal) {
        animalTreeSet.add(animal);
        System.out.println("created successfully");
    }

    @Override
    public Object readAllAnimal() {
        String result = "";
        for (Animal s : animalTreeSet) {
            result = result + "*" + s.getName() + "\n";

        }
        return result;
    }

    @Override
    public void updateAnimal(Animal aold, Animal anew) {
        if (animalTreeSet.contains(aold)) {
            animalTreeSet.remove(aold);
            animalTreeSet.add(anew);
            System.out.println("updated successfully");
        } else {
            System.out.println("The animal does not exist in the registry");
        }
    }

    @Override
    public void deleteAnimal(Animal animal) {
        if (animalTreeSet.contains(animal)) {
            animalTreeSet.remove(animal);

            System.out.println("removed successfull");
        } else {
            System.out.println("The animal does not exist in the registry");
        }
    }

}
