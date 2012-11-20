/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import collection.MySet;

/**
 *
 * @author Daniel
 */
public class Project1 {

    public static void test(String[] args) {

        MySet perfectSquareSet = new MySet();
        MySet fibonacciNumSet = new MySet();

        int a = 0;
        int b = 1;
        for (int c = 0; c < 75025; c++) {
            c = a + b;
            a = b;
            b = c;
            fibonacciNumSet.append(c);
            
        }

        System.out.println("Fibonacci Number Set: " + fibonacciNumSet);

        
        
        for (int i = 0; i <= 25; i++) {
            perfectSquareSet.append(i*i);
        }
        
        System.out.println("Perfect Square Set: " + perfectSquareSet);

        System.out.println(fibonacciNumSet.intersection(perfectSquareSet));
        
        System.out.println(fibonacciNumSet.symmetricDifference(perfectSquareSet));
        
        System.out.println(fibonacciNumSet.union(perfectSquareSet));
        
    }
}
