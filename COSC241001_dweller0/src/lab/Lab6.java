/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.SLList;
import collection.SLListNode;
import collection.SortedSLList;

/**
 * This class will add square numbers into 2 lists. One list will be sorted and 
 * the other list will not be. These lists will have some numbers removed and 
 * then added back in.
 * @author Daniel
 * @version 11.1.12
 */

public class Lab6 {

    /*
     * This is the method that will run in the main class.
     */
    
    public static void test() {

        SLList simpleList = new SLList();

        //for loop to find all values for perfect square up to 30
        //also adds the numbers into the simpleList
        for (int i = 0; i < 31; i++) {
            int k = i * i;
            if (i % 2 == 0) {
                simpleList.insert(k);
            } else {
                simpleList.append(k);
            }
        }

        //prints out the simple List
        System.out.println(simpleList);

        //removes 4 of the numbers from the list
        simpleList.remove(36);
        simpleList.remove(64);
        simpleList.remove(100);
        simpleList.remove(400);


        //prints out the new list with the 4 numbers removed.
        System.out.println(simpleList);

        //makes a new sortedList
        SortedSLList sortedList = new SortedSLList();
        
        //for loop to find all values for perfect square up to 30
        //also adds the numbers into the sortedList
        for (int i = 0; i < 31; i++) {
            int k = i * i;

            sortedList.insert(k);
        }

        //prints out the sorted list
        System.out.println(sortedList);

        //removes 6 numbers from the list
        sortedList.remove(1);
        sortedList.remove(36);
        sortedList.remove(64);
        sortedList.remove(144);
        sortedList.remove(400);
        sortedList.remove(900);

        //prints out the new sorted list with 6 numbers removed
        System.out.println(sortedList);

        //insert these 4 numbers back into the list
        sortedList.insert(1);
        sortedList.insert(64);
        sortedList.insert(400);
        sortedList.insert(900);

        //prints out the new sorted list with 4 numbers added back in
        System.out.println(sortedList);

    }
}
