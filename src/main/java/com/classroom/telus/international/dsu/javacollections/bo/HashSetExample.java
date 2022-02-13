package com.classroom.telus.international.dsu.javacollections.bo;

import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.*;

/**
 *
 * @author geovanni.santos
 */
public class HashSetExample implements AnimalInterface {

    static HashSet<Animal> AnimalsHashSet = new HashSet<>();

    public HashSetExample() {
    }

    @Override
    public void createAnimal(Animal animal) {
        AnimalsHashSet.add(animal);
        System.out.println("created successfully");

    }

    @Override
    public Object readAllAnimal() {
        String result = "";
        for (Animal s : AnimalsHashSet) {
            result = result + "*" + s.getName() + "\n";

        }
        return result;
    }

    @Override
    public void updateAnimal(Animal aold, Animal anew) {
        if (AnimalsHashSet.contains(aold)) {
            AnimalsHashSet.remove(aold);
            AnimalsHashSet.add(anew);
            System.out.println("updated successfully");
        } else {
            System.out.println("The animal does not exist in the registry");
        }
    }

    @Override
    public void deleteAnimal(Animal animal) {
        if (AnimalsHashSet.contains(animal)) {
            AnimalsHashSet.remove(animal);

            System.out.println("removed successfull");
        } else {
            System.out.println("The animal does not exist in the registry");
        }
    }

}
