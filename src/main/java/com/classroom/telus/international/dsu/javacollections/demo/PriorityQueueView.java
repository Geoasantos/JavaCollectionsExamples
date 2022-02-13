package com.classroom.telus.international.dsu.javacollections.demo;

import com.classroom.telus.international.dsu.javacollections.bo.PriorityQueueExample;
import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.Scanner;

/**
 *
 * @author geovanni.santos
 */
public class PriorityQueueView {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        PriorityQueueExample VarQueue = new PriorityQueueExample();
        int option;
        do {
            Animal animal;
            Animal animal2;
         
            System.out.println("\n\n======== PriorityQueue Example ==========");
            System.out.println("What do you want to do?\n"
                    + "1-Register a new Animal\n"
                    + "2-See the queue of registered animals\n"
                    + "3-update a registered animal\n"
                    + "4-Delete a registered animal\n"
                    + "5-Delete the head of the queue"
                    + "another to go out"
            );
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Please Entry a Name of the Animal");
                    String name = sc.next();
                    animal= new Animal(name);
                    VarQueue.createAnimal(animal);                    
                    
                    break;
                case 2:
                    System.out.println("\nThis is a complete list of the animals registered:");
                    System.out.println(VarQueue.readAllAnimal());
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
                    VarQueue.updateAnimal(animal,animal2);   
                    }catch(Exception e){
                        System.out.println(e.toString());}
                    
                    break;
                case 4:
                    System.out.println("-- Remove Animal --");
                    System.out.println("Please Entry a Name of the Animal");
                    name = sc.next();
                    animal = new Animal(name);
                    VarQueue.deleteAnimal(animal);                    
                    break;
                case 5:
                    String ans;
                    System.out.println("You are going to delete the head of the queue, Write 'YES' for continue...");
                    ans=sc.next();
                    if(ans.equals("YES")){
                    VarQueue.deleteHead();}else{
                    System.out.println("Delete Head canceled.");
                    }
                    break;
                    
                default:
               System.out.println("exiting PriorityQueue");
                       
                    
               break;
                
            }
            
        } while (option>0 && option<6);
    }
}
