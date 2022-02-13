package com.classroom.telus.international.dsu.javacollections.demo;

import com.classroom.telus.international.dsu.javacollections.bo.VectorExample;
import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.Scanner;

/**
 *
 * @author geovanni.santos
 */
public class VectorView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        VectorExample varVector = new VectorExample();
        int option;
        int index;
        do {
            Animal animal;
         
         
            System.out.println("\n\n======== Vector Example ==========");
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
                    System.out.println("Notice: Vector allows duplicate animals");
                    System.out.println("Please Entry a Name of the Animal");
                    String name = sc.next();
                    animal= new Animal(name);
                    varVector.createAnimal(animal);                    
                    
                    break;
                case 2:
                    System.out.println("\nAnimals List:\nIndex\tName");
                    System.out.println(varVector.readAllAnimal());
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
                    varVector.updateAnimal(index,animal);   
                    }catch(Exception e){
                        System.out.println(e.toString());}
                    
                    break;
                case 4:
                    System.out.println("-- Remove Animal --");
                    System.out.println("enter the index of the animal that you want to remove"
                            + "\nif you dont know the index"
                            + "\nPlease check option 2 of principal menu for to see it");
                    index=sc.nextInt();              
                    varVector.deleteAnimal(index);                    
                    break;
                    
                default:
               System.out.println("exiting Vector");
                       
                    
               break;
                
            }
            
        } while (option>0 && option<5);
    }
    
}
