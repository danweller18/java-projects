/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.MyVector;
import java.util.*;
import collection.MySort;

/**
 *
 * @author Daniel
 */
public class Lab5 {

    public static void test() {
//a.
        MyVector numVec = new MyVector();
        Random r = new Random();
        int left = 0;
        int right = 0;
        Comparable[] temp = new Comparable[20000];
        
//b.
//bubbleSort
        r.setSeed(20121024);

        for (int i = 0; i < 20000; i++) {
            numVec.append(r.nextInt(100000));
        }

        long time1 = System.currentTimeMillis();
        MySort.bubbleSort(numVec);
        long time2 = System.currentTimeMillis();        
        long difference = time2 - time1;        
        System.out.println("The time difference for Bubble Sort is: " + difference);
        
        //print out numbers
        System.out.println("Element at index 0: " + numVec.elementAt(0));
        System.out.println("Element at index 1: " + numVec.elementAt(1));
        System.out.println("Element at index 2: " + numVec.elementAt(2));
        System.out.println("Element at index 9999: " + numVec.elementAt(9999));
        System.out.println("Element at index 19999: " + numVec.elementAt(19999));        
        System.out.println(" ");
        
//selction sort
        
        r.setSeed(20121024);
        numVec.clear();

        for (int i = 0; i < 20000; i++) {
            numVec.append(r.nextInt(100000));
        }

        time1 = System.currentTimeMillis();
        MySort.selectionSort(numVec);
        time2 = System.currentTimeMillis();
        difference = time2 - time1;        
        System.out.println("The time difference for Selection Sort is: " + difference);
        
        //print out numbers
         System.out.println("Element at index 0: " + numVec.elementAt(0));
        System.out.println("Element at index 1: " + numVec.elementAt(1));
        System.out.println("Element at index 2: " + numVec.elementAt(2));
        System.out.println("Element at index 9999: " + numVec.elementAt(9999));
        System.out.println("Element at index 19999: " + numVec.elementAt(19999));
        System.out.println(" ");
        
//merge sort
        
        r.setSeed(20121024);
        numVec.clear();

        for (int i = 0; i < 20000; i++) {
            numVec.append(r.nextInt(100000));
        }

        time1 = System.currentTimeMillis();
        MySort.mergeSort(numVec, temp, left, right);
        time2 = System.currentTimeMillis();
        difference = time2 - time1;        
        System.out.println("The time difference for Merge Sort is: " + difference);
        
        //print out numbers
        System.out.println("Element at index 0: " + numVec.elementAt(0));
        System.out.println("Element at index 1: " + numVec.elementAt(1));
        System.out.println("Element at index 2: " + numVec.elementAt(2));
        System.out.println("Element at index 9999: " + numVec.elementAt(9999));
        System.out.println("Element at index 19999: " + numVec.elementAt(19999));
        System.out.println(" ");
        
//quick sort
        
        r.setSeed(20121024);
        numVec.clear();

        for (int i = 0; i < 20000; i++) {
            numVec.append(r.nextInt(100000));
        }

        time1 = System.currentTimeMillis();
        MySort.quickSort(numVec, left, right);
        time2 = System.currentTimeMillis();
        difference = time2 - time1;        
        System.out.println("The time difference for Quick Sort is: " + difference);
        
        //print out numbers
        System.out.println("Element at index 0: " + numVec.elementAt(0));
        System.out.println("Element at index 1: " + numVec.elementAt(1));
        System.out.println("Element at index 2: " + numVec.elementAt(2));
        System.out.println("Element at index 9999: " + numVec.elementAt(9999));
        System.out.println("Element at index 19999: " + numVec.elementAt(19999));
        System.out.println(" ");
        
//Insertion sort
        
        r.setSeed(20121024);
        numVec.clear();

        for (int i = 0; i < 20000; i++) {
            numVec.append(r.nextInt(100000));
        }

        time1 = System.currentTimeMillis();
        MySort.insertionSort(numVec, left, right);
        time2 = System.currentTimeMillis();
        difference = time2 - time1;        
        System.out.println("The time difference for Insertion Sort is: " + difference);
        
        //print out numbers
        System.out.println("Element at index 0: " + numVec.elementAt(0));
        System.out.println("Element at index 1: " + numVec.elementAt(1));
        System.out.println("Element at index 2: " + numVec.elementAt(2));
        System.out.println("Element at index 9999: " + numVec.elementAt(9999));
        System.out.println("Element at index 19999: " + numVec.elementAt(19999));
        System.out.println(" ");
        
//shell sort
        
        r.setSeed(20121024);
        numVec.clear();

        for (int i = 0; i < 20000; i++) {
            numVec.append(r.nextInt(100000));
        }

        time1 = System.currentTimeMillis();
        MySort.shellSort(numVec);
        time2 = System.currentTimeMillis();
        difference = time2 - time1;        
        System.out.println("The time difference for Shell Sort is: " + difference);
        
        //print out numbers
        System.out.println("Element at index 0: " + numVec.elementAt(0));
        System.out.println("Element at index 1: " + numVec.elementAt(1));
        System.out.println("Element at index 2: " + numVec.elementAt(2));
        System.out.println("Element at index 9999: " + numVec.elementAt(9999));
        System.out.println("Element at index 19999: " + numVec.elementAt(19999));
        System.out.println(" ");

    }
}
