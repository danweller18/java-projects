/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.DLList;
import collection.DLListNode;
import collection.MyDeque;
import java.io.*;

/**
 * This program will read in a file, determine whether or not it is a
 * palindrome, and then write the results into a text file.
 *
 * @author Daniel
 * @version 11.13.12
 */
public class Lab8 {

    public static void test() {

        //creates a DLList 
        DLList simpleDLList = new DLList();

        //creates a MyDeque
        MyDeque simpleDeque = new MyDeque();

        //this will read the file line by line
        try {
            BufferedReader reader = new BufferedReader(new FileReader("../Lab8Input.txt"));
            String line;
            FileWriter writer = new FileWriter("../Lab8Output_dweller0.txt ");

            //alternative to line = reader.readline() != null is reader.ready
            //because it checks to see if the reader is empty.
            while ((line = reader.readLine()) != null) {

                line = line.trim();
                for (char c : line.toCharArray()) {
                    simpleDLList.insert(c);
                    simpleDeque.insertBack(c);
                }

                boolean palindrome = true;

                for (DLListNode l = simpleDLList.head, d = simpleDeque.head; palindrome && l != null && d != null; l = l.next, d = d.next) {
                    //if loop compares the contents of the two lists to see if it is a palindrome.
                    if (!l.data.equals(d.data)) {
                        palindrome = false;
                    }
                }
                if (palindrome) {
                    writer.write("\"" + line + "\" is a palindrome.\r\n");
                } else {
                    writer.write("\"" + line + "\" is not a palindrome.\r\n");
                }
                simpleDLList.clear();
                simpleDeque.clear();
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            //the specified file could not be found
        } catch (IOException e) {
            //something went wrong with reading or closing.
        }

    }
}
