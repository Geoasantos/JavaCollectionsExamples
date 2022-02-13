package com.classroom.telus.international.dsu.javacollections.demo;

import com.classroom.telus.international.dsu.javacollections.bo.HashmapExample;
import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.Scanner;

/**
 *
 * @author geovanni.santos
 */
public class HashMapView {
    
     
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        HashmapExample varHashmap = new HashmapExample();
        int option;
        int index;
        do {
            Animal animal;
         
         
            System.out.println("\n\n======== HashMap Example ==========");
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
                    System.out.println("Please Entry a Name of the Animal");
                    String name = sc.next();
                    animal= new Animal(name);
                    varHashmap.createAnimal(animal);                    
                    
                    break;
                case 2:
                    System.out.println("\nAnimals List:\nIndex\tName");
                    System.out.println(varHashmap.readAllAnimal());
                    break;
                case 3:
                   
                    System.out.println("-- Update an Animal --");
                    System.out.println("enter the index of the animal that you want to edit"
                            + "\nif you dont know the index"
                            + "\nPlease check option 2 of principal menu for to see it");
                    index=sc.nextInt();                    
                    System.out.println("Now enter your edit");
                    String edit = sc.next();
                    animal=new Animal(edit);
                    try{
                    varHashmap.updateAnimal(index,animal);   
                    }catch(Exception e){
                        System.out.println(e.toString());}
                    
                    break;
                case 4:
                    System.out.println("-- Remove Animal --");
                    System.out.println("enter the index of the animal that you want to remove"
                            + "\nif you dont know the index"
                            + "\nPlease check option 2 of principal menu for to see it");
                    index=sc.nextInt();              
                    varHashmap.deleteAnimal(index);                    
                    break;
                    
                default:
               System.out.println("exiting HashMap");
                       
                    
               break;
                
            }
            
        } while (option>0 && option<5);
    }
    
}
