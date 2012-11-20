/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Random;
import collection.MyQueue;
import collection.MyStack;
import java.io.*;

/**
 * This program will add randomly generated numbers into a stack and a queue.
 *
 * @author Daniel
 * @version 11.8.12
 */
public class Lab7 {

    public static void test() {

        //creates a random number generator and sets the current time.
        Random r = new Random();
        r.setSeed(System.nanoTime());

        MyStack stack = new MyStack();

        MyQueue queue = new MyQueue();

        //loop to add 30 numbers into the MyStack 
        for (int i = 0; i < 30; i++) {
            stack.push(r.nextInt());
        }

        //loop to add 30 numbers into the MyQueue 
        for (int i = 0; i < 30; i++) {
            queue.insertBack(r.nextInt());
        }

        //Then do 20 pop() on the MyStack instance
        for (int i = 0; i < 20; i++) {
            stack.pop();
        }

        //20 removeFront() on the MyQueue instance
        for (int i = 0; i < 20; i++) {
            queue.removeFront();
        }

        //use the try catch clause to create a new file and write the stack
        //and the queue to the file.
        try {
            FileWriter writer = new FileWriter("../Lab7Output_dweller0.txt");

            writer.write(stack.toString());
            writer.write("\r\n");
            writer.write(queue.toString());

            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
