package com.classroom.telus.international.dsu.javacollections.bo;

import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author geovanni.santos
 */
public class PriorityQueueExample implements AnimalInterface {

    PriorityQueue<Animal> animalsQueue = new PriorityQueue<>();

    @Override
    public void createAnimal(Animal animal) {
        animalsQueue.add(animal);
        System.out.println("created successfully");
    }

    @Override
    public Object readAllAnimal() {
        String result = "The Head of the queue is: " + animalsQueue.peek().getName() + "\n";
        for (Animal s : animalsQueue) {
            result = result + "*" + s.getName() + "\n";
        }
        return result;
    }
    
      @Override
    public void updateAnimal(Animal aold, Animal anew) {
        if (animalsQueue.contains(aold)) {
            animalsQueue.remove(aold);
            animalsQueue.add(anew);
            System.out.println("updated successfully");
        } else {
            System.out.println("The animal does not exist in the queue");
        }
    }
    
     @Override
    public void deleteAnimal(Animal animal) {
        if (animalsQueue.contains(animal)) {
            animalsQueue.remove(animal);

            System.out.println("removed successfull");
        } else {
            System.out.println("The animal does not exist in the registry");
        }
    }
    
    public void deleteHead(){
    animalsQueue.remove();
        System.out.println("Head of the que was Delete");
    }

}
