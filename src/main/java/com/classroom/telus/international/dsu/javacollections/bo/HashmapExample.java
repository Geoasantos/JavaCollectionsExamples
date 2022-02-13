package com.classroom.telus.international.dsu.javacollections.bo;

import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author geovanni.santos
 */
public class HashmapExample implements AnimalInterface{
    
    HashMap<Integer, Animal> animalsHashMap = new HashMap<>();
    static int contador;

    @Override
    public void createAnimal(Animal animal) {
        Integer index = ++contador;
        animalsHashMap.put(index, animal);
        System.out.println("created successfully");

    }

    @Override
    public Object readAllAnimal() {
        String result = "";
        for (Map.Entry<Integer, Animal> e : animalsHashMap.entrySet()) {
            result = result + e.getKey() + " \t "
                    + e.getValue()+"\n";
        }

        return result;
    }
    
     public void updateAnimal(int index, Animal anew) {
        if (animalsHashMap.containsKey(index)){
            animalsHashMap.put(index, anew);
            System.out.println("Updated successfully");
        }else{
            System.out.println("Error: invalid data entered");}
    }
     
     public void deleteAnimal(int index){
         if (animalsHashMap.containsKey(index)){
            animalsHashMap.remove(index);
            System.out.println("Remove successfully");
        }else{
            System.out.println("Error: invalid data entered");}
     }

    @Override
    public void updateAnimal(Animal aold, Animal anew) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAnimal(Animal animal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
