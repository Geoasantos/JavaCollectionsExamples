package com.classroom.telus.international.dsu.javacollections.demo;

import com.classroom.telus.international.dsu.javacollections.bo.HashSetExample;
import com.classroom.telus.international.dsu.javacollections.vo.Animal;
import java.util.Scanner;

/**
 *
 * @author geovanni.santos
 */
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("======= Java Collections Framework ========");
            System.out.println("Select which java collation you want to test");
            System.out.println("1  - HashSet\n"
                    + "2  - LinkedHashSet\n"
                    + "3  - TreeSet\n"
                    + "4  - ArrayList\n"
                    + "5  - Vector\n"
                    + "6  - LinkedList\n"
                    + "7  - PriorityQueue\n"
                    + "8  - HashTable\n"
                    + "9  - Hashmap\n"
                    + "10 - LinkedHashMap\n"
                    + "11 - Treemap\n"
                    + "Other for exit");
            option = sc.nextInt();
            
            switch(option){
                case 1: 
                    HashSetView run1 = new HashSetView();
                    run1.main(args);
                    break;
                case 2:
                    LinkedHashSetView run2 = new LinkedHashSetView();
                    run2.main(args);
                    break;
                case 3: 
                    TreeSetView run3 = new TreeSetView();
                    run3.main(args);
                    break;
                case 4: 
                    ListArrayListView run4 = new ListArrayListView();
                    run4.main(args);
                    break;
                case 5: 
                    VectorView run5 = new VectorView();
                    run5.main(args);
                    break;
                case 6:
                    LinkedListView run6 = new LinkedListView();
                    run6.main(args);
                    break;
                case 7:
                    PriorityQueueView run7 = new PriorityQueueView();
                    run7.main(args);
                    break;
                case 8: 
                    HashtableView run8 = new HashtableView();
                    run8.main(args);
                    break;
                case 9: 
                    HashMapView run9 = new HashMapView();
                    run9.main(args);
                    break;
                case 10: 
                    LinkedHashMapView run10 = new LinkedHashMapView();
                    run10.main(args);
                    break;
                case 11: 
                    TreeMapView run11 = new TreeMapView();
                    run11.main(args);
                    break;
                default:
                    System.out.println("Closing Demo...");
               
                
            
            }
            

        } while (option > 0 && option < 12);

    }

}
