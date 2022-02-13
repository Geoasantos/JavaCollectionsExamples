package com.classroom.telus.international.dsu.javacollections.vo;

import java.util.Objects;

/**
 *
 * @author Geovanni Santos
 *
 */
public class Animal implements Comparable<Animal> {


    private String name;
  
   

    public Animal() {

    }

   
    public Animal(String name) {
        this.name = name;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    
     @Override
    public int compareTo(Animal e) { //implementing abstract method.
        if (this.name.compareTo(e.name) > 0) {
            return 1;
        }
        if (this.name.compareTo(e.name) < 0) {
            return -1;
        }
        return 0;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return  name;
    }
    
    

  

}
