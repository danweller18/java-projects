/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.MyVector;

/**
 *
 * @author Daniel
 */
public class Lab2 {

    public static void test(String[] args) {

        MyVector vec = new MyVector();
        int a = 0;
        int b = 1;
        vec.append(b);

        for (int c = 0; c < 800100;) {
            c = a + b;
            a = b;
            b = c;
            vec.append(c);
        }

        System.out.println(" " + vec);

        vec.reverse();

        vec.clone();
        System.out.println(vec);

        for (int i = vec.size(); i >= 0; i--) {

            if ((i % 2) == 1) {
                vec.removeAt(i);
            }
        }

        System.out.println(vec);
        vec.reverse();
        System.out.println(vec);
        vec.merge(vec);
        System.out.println(vec);
    }
}