package com.classroom.telus.international.dsu.javacollections.demo;

import com.classroom.telus.international.dsu.javacollections.bo.HashSetExample;
import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.Scanner;

/**
 *
 * @author geovanni.santos
 */
public class HashSetView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashSetExample HashSet = new HashSetExample();
        int option;
        do {
            Animal animal;
            Animal animal2;
         
            System.out.println("\n\n======== HashSet Example ==========");
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
                    System.out.println("Notice: HashSet do not allow duplicate animals");
                    System.out.println("Please Entry a Name of the Animal");
                    String name = sc.next();
                    animal= new Animal(name);
                    HashSet.createAnimal(animal);                    
                    
                    break;
                case 2:
                    System.out.println("\nThis is a complete list of the animals registered:");
                    System.out.println(HashSet.readAllAnimal());
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
                    HashSet.updateAnimal(animal,animal2);   
                    }catch(Exception e){
                        System.out.println(e.toString());}
                    
                    break;
                case 4:
                    System.out.println("-- Remove Animal --");
                    System.out.println("Please Entry a Name of the Animal");
                    name = sc.next();
                    animal = new Animal(name);
                    HashSet.deleteAnimal(animal);                    
                    break;
                    
                default:
               System.out.println("exiting HashSet");
                       
                    
               break;
                
            }
            
        } while (option>0 && option<5);
       
    }

}
