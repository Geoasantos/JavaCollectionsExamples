package com.classroom.telus.international.dsu.javacollections.bo;

import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.ArrayList;

/**
 *
 * @author geovanni.santos
 */
public class ArrayListExample implements AnimalInterface {

    ArrayList<Animal> animalsList = new ArrayList<>();

    @Override
    public void createAnimal(Animal animal) {
        animalsList.add(animal);
        System.out.println("created successfully");
    }

    @Override
    public Object readAllAnimal() {
        String result = "";
        int i = 0;
        for (Animal s : animalsList) {
            result = result + i + " -\t" + s.getName() + "\n";
            i++;

        }
        return result;
    }

    public void updateAnimal(int index, Animal anew) {
        if (animalsList.size() >= 0 && index >= 0 && index < animalsList.size()) {
            animalsList.set(index, anew);
            System.out.println("Updated successfully");
        }else{
            System.out.println("Error: invalid data entered");}
    }

     public void deleteAnimal(int index) {
        if (animalsList.size() >= 0 && index >= 0 && index < animalsList.size()) {
            animalsList.remove(index);
            System.out.println("Removed successfully");
        }else{
            System.out.println("Error: invalid index entered");}
    }
     
     
    @Override
    public void deleteAnimal(Animal animal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateAnimal(Animal aold, Animal anew) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
