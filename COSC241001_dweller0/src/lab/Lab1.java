/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author dweller0
 */
import java.util.*;

public class Lab1 {

    public static void test(String[] args) {

        Vector<Integer> vector = new Vector<Integer>();
        /*int primitiveInt = 241;
         Integer wrapperInt = new Integer(1234);
       
         vector.add(primitiveInt);
         vector.add(wrapperInt);
        
         vector.add(2, new Integer(2128));
         System.out.println("The elements of vector: " + vector); System.out.println("The size of vector is: " 
         + vector.size());
         System.out.println("The elements at position 2 is: " 
         + vector.elementAt(2));
         System.out.println("The first element of vector is: " 
         + vector.firstElement());
         System.out.println("The last element of vector is: " 
         + vector.lastElement());
         vector.removeElementAt(1);
         System.out.println("The elements of vector: " + vector); System.out.println("The size of vector is: " 
         + vector.size());
         System.out.println("The elements at position 2 is: " 
         + vector.elementAt(2));
         System.out.println("The first element of vector is: " 
         + vector.firstElement());
         System.out.println("The last element of vector is: " 
         + vector.lastElement());*/

        vector.clear();

        System.out.println("All numbers: ");

        for (int i = 0; i < args.length; ++i) {
            vector.add(Integer.parseInt(args[i]));
            System.out.println(vector.get(i));
        }

        System.out.println("Only even numbers: ");

        for (int i = vector.size() - 1; i > 0; --i) {
            if (vector.get(i) % 2 == 1) {
                vector.removeElementAt(i);
            }
        }

        for (int i = vector.size() - 1; i > 0; --i) {
            System.out.println(vector.get(i));
        }
    }
}
