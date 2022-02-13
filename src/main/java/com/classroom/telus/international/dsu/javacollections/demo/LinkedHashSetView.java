package com.classroom.telus.international.dsu.javacollections.demo;

import com.classroom.telus.international.dsu.javacollections.bo.LinkedHashSetExample;
import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.Scanner;

/**
 *
 * @author geovanni.santos
 */
public class LinkedHashSetView {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
        LinkedHashSetExample linkedHashSet = new LinkedHashSetExample();
        int option;
        do {
            Animal animal;
            Animal animal2;
         
            System.out.println("\n\n======== LinkedHashSet Example ==========");
            System.out.println("What do you want to do?\n"
                    + "1-Register a new Animal\n"
                    + "2-See the list of registered animals\n"
                    + "3-update a registered animal\n"
                    + "4-Delete a registered animal\n"
                    + "another to go out"
            );
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Notice: LinkedHashSet do not allow duplicate animals");
                    System.out.println("Please Entry a Name of the Animal");
                    String name = sc.next();
                    animal= new Animal(name);
                    linkedHashSet.createAnimal(animal);                    
                    
                    break;
                case 2:
                    System.out.println("\nThis is a complete list of the animals registered:");
                    System.out.println(linkedHashSet.readAllAnimal());
                    break;
                case 3:
                   
                    System.out.println("-- Update an Animal --");
                    System.out.println("enter the animal you want to edit");
                    name = sc.next();
                    animal=new Animal(name);
                    System.out.println("Now enter your edit");
                    String edit = sc.next();
                    animal2=new Animal(edit);
                    try{
                    linkedHashSet.updateAnimal(animal,animal2);   
                    }catch(Exception e){
                        System.out.println(e.toString());}
                    
                    break;
                case 4:
                    System.out.println("-- Remove Animal --");
                    System.out.println("Please Entry a Name of the Animal");
                    name = sc.next();
                    animal = new Animal(name);
                    linkedHashSet.deleteAnimal(animal);                    
                    break;
                    
                default:
               System.out.println("exiting LinkedHashSet");
                       
                    
               break;
                
            }
            
        } while (option>0 && option<5);
    }
}
