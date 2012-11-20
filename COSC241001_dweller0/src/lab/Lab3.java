/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.MyVector;
import java.util.*;
import collection.MySort;
import collection.MySearch;

/**
 *
 * @author Daniel
 */
public class Lab3 {
    
     public static void test() {
    
    MyVector numVec = new MyVector();
    /**
     * Random r = new Random();
     * r.setSeed(System.nanoTime());
     * 
     * in the for loop
     * numVec.append(r.nextInt(900 + 100);
     * 
     * oracle.com
     */
    Random r = new Random();
    r.setSeed(System.nanoTime());
    
    for(int i = 0; i < 61; i++){
        
        numVec.append(r.nextInt(900 + 100));
    }
    
    MySort.bubbleSort(numVec);
    System.out.println(numVec);
    
    System.out.println("Please enter a number on the keyboard: ");
    Scanner a = new Scanner(System.in);
    int w = a.nextInt();
    
    MySearch.linearSearchSorted(numVec, w);
    System.out.println(numVec);
    
    numVec.removeRange(2,22);
    
    numVec.reverse();
    
    MySort.selectionSort(numVec);
    
    System.out.println(numVec);
    
    System.out.println("Please enter a number on the keyboard: ");
    Scanner b = new Scanner(System.in);
    int q = b.nextInt();
    
    MySearch.binarySearch(numVec, q);
    System.out.println(numVec);
     }
     
}
