package com.classroom.telus.international.dsu.javacollections.bo;

import com.classroom.telus.international.dsu.javacollections.vo.Animal;

/**
 *
 * @author geovanni.santos
 */
public interface AnimalInterface {

    public void createAnimal(Animal animal);

    public Object readAllAnimal();

    public void updateAnimal(Animal aold, Animal anew);

    public void deleteAnimal(Animal animal);

}
